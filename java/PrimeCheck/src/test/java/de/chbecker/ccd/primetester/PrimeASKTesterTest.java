package de.chbecker.ccd.primetester;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.chbecker.ccd.interfaces.PrimeTesterType;

public class PrimeASKTesterTest extends BasePrimeTester {

	@Before
	public void setUp() {
		primeTester = PrimeTesterFactory.getTester(PrimeTesterType.ASK);
	}
	
}
