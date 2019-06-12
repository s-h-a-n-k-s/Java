package com.nbs;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{	
	@Test
	public void canAdd() {
		App app = new App();

		int result = app.add(2, 3);
		assertTrue("can add", (result == 5));

		result = app.add(5, 5);
		assertTrue("can add", (result == 10));

		result = app.add(10, 20);
		assertTrue("can add", (result == 30));
	}

	@Test
	public void canSubtract() {
		App app = new App();

		int result = app.subtract(10, 5);
		assertTrue("can subtract", (result == 5));

		result = app.subtract(0, 5);
		assertTrue("can subtract", (result == -5));

		result = app.subtract(20, 10);
		assertTrue("can subtract", (result == 10));
	}
}
