package de.chbecker.ccd.primetester;

import de.chbecker.ccd.interfaces.PrimeTester;

public class PrimeASKTester implements PrimeTester {

	/* Agrawal-Kayal-Saxena-Primzahltest
	 * http://de.wikipedia.org/wiki/AKS-Primzahltest
	 * 
	 * Pseudocode:
	 * 
1. if (n ist eine reine Potenz) return ZUSAMMENGESETZT
2. finde das kleinste r mit o_r(n)>log(n)2
3. if 1<ggT(a,n)<n für ein a ≤ r return ZUSAMMENGESETZT
4. if n ≤ r return PRIM
5. for a=1 to sqrt(phi(r))*log(n) do
      if (x+a)n ≠ xn+a (mod (xr-1,n)) return ZUSAMMENGESETZT
6. return PRIM
	 
	 */
	@Override
	public boolean isPrime(int primeCandidate) {
		return false;
		
	}

}
