package de.chbecker.ccd.primetester;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import de.chbecker.ccd.interfaces.PrimeTester;
import de.chbecker.ccd.interfaces.PrimeTesterType;

public class BasePrimeTester {

	protected PrimeTester primeTester;
	final int[] primesTil100 = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };

	@Before
	public void setUp() {
		primeTester = PrimeTesterFactory.getTester(PrimeTesterType.SIMPLE);
	}

	@Test
	public void testIsPrimeSmalesPrime() {
		assertTrue(primeTester.isPrime(2));
	}

	@Test
	public void testIsPrimeSmalesOddPrime() {
		assertTrue(primeTester.isPrime(3));
	}

	@Test
	public void testIsNotPrime() {
		assertFalse(primeTester.isPrime(-2));
		assertFalse(primeTester.isPrime(0));
		assertFalse(primeTester.isPrime(1));
	}

	@Test
	public void testNumerstil100() {
		for (int i : primesTil100) {
			assertTrue(primeTester.isPrime(i));
		}
	}

	@Test
	@Ignore
	public void mumberstil100NotPrime() {
		Set<Integer> primes100 = new HashSet<Integer>();
		for (int i : primesTil100) {
			primes100.add(i);
		}

		for (int i = 0; i < 100; i++) {
			if (primes100.contains(i)) {
				assertTrue(primeTester.isPrime(i));
			} else {
				assertFalse("Is not prime assumed for " + i, primeTester.isPrime(i));
			}
		}
	}

	@Test
	public void test9isNotPrime() {
		assertFalse(primeTester.isPrime(9));
	}
}
