package de.chbecker.ccd;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import de.chbecker.ccd.interfaces.ExternalClient;
import de.chbecker.ccd.internals.PriorityInvalidException;
import de.chbecker.ccd.internals.SITProperties;
import de.chbecker.ccd.internals.SupplierJob;
import de.chbecker.ccd.internals.SupplierJobFactory;
import de.chbecker.ccd.internals.Task;

public class SingleLevelOfAbstraction {
	private Map<Long, Task> queuedTasks = Collections.synchronizedMap(new HashMap<Long, Task>());
	private ExternalClient externalClient;
	private Map<Integer, Integer> clientPriorityMap;

	public SingleLevelOfAbstraction() {
	}

	/**
	 * SupplierJobs from internal and external clients
	 * @param amount
	 * @return SupplierJobArray
	 */
	public SupplierJob[] getSupplierJobs(short amount) {
		Set<SupplierJob> jobs = new HashSet<SupplierJob>(amount);
		jobs.addAll(getExternalSupplierJobs(calculateExternalClientAmount(amount)));
		jobs.addAll(getInternalSupplierJobs(calculateDiffToFill(amount, jobs)));
		jobs.addAll(getExternalSupplierJobs(calculateDiffToFill(amount, jobs)));
		removeFromInternalQueue(jobs);
		return jobSetToArray(jobs);
	}

	private SupplierJob[] jobSetToArray(Set<SupplierJob> jobs) {
		return jobs.toArray(new SupplierJob[jobs.size()]);
	}

	private void removeFromInternalQueue(Set<SupplierJob> jobs) {
		for (SupplierJob job : jobs) {
			queuedTasks.remove(job.externalId);
		}

	}

	private Set<SupplierJob> getInternalSupplierJobs(int amountParam) {
		int amount = amountParam;
		Set<SupplierJob> jobs = new HashSet<SupplierJob>(amount);
		Iterator<Entry<Long, Task>> it = queuedTasks.entrySet().iterator();
		while (amount > 0 && it.hasNext()) {
			SupplierJob job = SupplierJobFactory.supplierJobFromTask(it.next());
			jobs.add(job);
			amount--;
		}
		return jobs;
	}

	private Set<SupplierJob> getExternalSupplierJobs(int amount) {
		Set<SupplierJob> ejobs = new HashSet<SupplierJob>(1);
		if (externalClient != null) {
			ejobs = externalClient.getSupplierJobs(amount);
		}
		return ejobs;
	}

	private int calculateExternalClientAmount(short amountRequest) {
		int m = SITProperties.getIntValue("prio_m", 1);
		int n = SITProperties.getIntValue("prio_n", 1);
		short divisor = (short) ((m + n) / m);
		return amountRequest / divisor;
	}

	private int calculateDiffToFill(short amountRequest, Set<SupplierJob> jobs) {
		return amountRequest - jobs.size();
	}

	public int size() {
		return queuedTasks.size();
	}

	public void addTasks(HashMap<Long, Task> tasks) {
		queuedTasks.putAll(tasks);
	}

	public void setClientPriorities(Map<Integer, Integer> clientPriorityMap) {
		checkPriority(clientPriorityMap);
		this.clientPriorityMap = clientPriorityMap;
	}

	private void checkPriority(Map<Integer, Integer> clientPriorityMap) {
		final int MAX_CLIENT_PRIORITY = 100;
		final int MIN_CLIENT_PRIORITY = 0;
		int sum = 0;
		for (Integer prio : clientPriorityMap.values()) {
			if (prio < MIN_CLIENT_PRIORITY || prio > MAX_CLIENT_PRIORITY) {
				throw new PriorityInvalidException("One priority is not in [" + MIN_CLIENT_PRIORITY + "," + MAX_CLIENT_PRIORITY
				        + "]");
			}
			sum += prio;
		}
		if (sum > MAX_CLIENT_PRIORITY) {
			throw new PriorityInvalidException("Sum of priorities is greater than " + MAX_CLIENT_PRIORITY);
		}
	}

	public void setExternalClient(ExternalClient externalClient) {
		this.externalClient = externalClient;
	}

}