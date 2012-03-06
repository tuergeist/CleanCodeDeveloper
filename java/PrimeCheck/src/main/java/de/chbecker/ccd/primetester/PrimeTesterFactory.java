package de.chbecker.ccd.primetester;

import de.chbecker.ccd.interfaces.PrimeTester;

public final class PrimeTesterFactory {

	private PrimeTesterFactory() {
		
	}

	public static PrimeTester getTester(PrimeTesters simple) {
		return new SimplePrimeTester();
	}
	
}
