package de.chbecker.ccd.primetester;

import de.chbecker.ccd.interfaces.PrimeTester;

public class PrimeTesterImpl implements PrimeTester {
	
	public static final String description = "Trial Division"; 
	private static final int SMALEST_PRIME = 2;

	/**
	 * Simple prime test
	 */
	public boolean isPrime(int primeCandidate) {
		boolean result = false;
		if (primeCandidate == SMALEST_PRIME) {
			result = true;
		}
		else if (primeCandidate > SMALEST_PRIME) {
			result = true;
			double max = Math.sqrt(primeCandidate) + 1;
			for (int i=2; i < max; i++) {
				if (primeCandidate % i == 0) {
					result = false;
				}
			}
		}
		return result;
	}
}
