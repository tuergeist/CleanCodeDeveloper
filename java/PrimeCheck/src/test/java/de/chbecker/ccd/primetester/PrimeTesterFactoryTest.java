package de.chbecker.ccd.primetester;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeTesterFactoryTest {

	@Test
	public void getSimpleTester() {
		assertTrue(PrimeTesterFactory.getTester(PrimeTesters.SIMPLE) instanceof SimplePrimeTester);
	}

}
