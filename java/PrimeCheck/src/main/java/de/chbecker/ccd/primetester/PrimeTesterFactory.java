package de.chbecker.ccd.primetester;

import de.chbecker.ccd.interfaces.PrimeTester;
import de.chbecker.ccd.interfaces.PrimeTesterType;

public final class PrimeTesterFactory {

	private PrimeTesterFactory() {
	}

	public static PrimeTester getTester(PrimeTesterType simple) {
		switch (simple) {
		case SIMPLE:
			return new SimplePrimeTester();			

		case ASK:
			return new PrimeASKTester();
			
		default:
			throw new RuntimeException("Nicht implementiert");
		}
	}

}
