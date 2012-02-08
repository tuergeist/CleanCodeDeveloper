package de.chbecker.ccd.interfaces;
import java.util.Set;

import de.chbecker.ccd.internals.SupplierJob;


public interface ExternalClient {
	public Set<SupplierJob> getSupplierJobs(int amount);

}
