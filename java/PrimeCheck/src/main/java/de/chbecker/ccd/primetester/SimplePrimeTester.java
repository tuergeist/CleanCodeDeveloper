package de.chbecker.ccd.primetester;

import de.chbecker.ccd.interfaces.PrimeTester;

public class SimplePrimeTester implements PrimeTester {

	public static final String description = "Trial Division";
	private static final int SMALEST_PRIME = 2;

	/**
	 * Simple prime test
	 */
	public boolean isPrime(int primeCandidate) {
		if (primeCandidate < SMALEST_PRIME) {
			return false;
		}
		if (primeCandidate == SMALEST_PRIME) {
			return true;
		}
		final double max = Math.sqrt(primeCandidate) + 1;
		for (int i = SMALEST_PRIME; i < max; i++) {
			if (primeCandidate % i == 0) {
				return false;
			}
		}
		return true;
	}
}
