package de.chbecker.ccd.primetester;

import static org.junit.Assert.*;

import org.junit.Test;

import de.chbecker.ccd.interfaces.PrimeTesterType;

public class PrimeTesterFactoryTest {

	@Test
	public void getSimpleTester() {
		assertTrue(PrimeTesterFactory.getTester(PrimeTesterType.SIMPLE) 
				instanceof SimplePrimeTester);
	}

	@Test
	public void getASKTester() {
		assertTrue(PrimeTesterFactory.getTester(PrimeTesterType.ASK) 
				instanceof PrimeASKTester);
	}
}
