package studio5.tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import studio5.Methods;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FilledArrayPreliminaryTest {
	@Test
	public void testArrayLength0() {
		int length = 0;
		int ignored = 16;
		int[] actuals = Methods.filledArray(length, ignored);
		assertNotNull(actuals);
		assertEquals(length, actuals.length);
		int[] expecteds = {};
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testArrayLength1() {
		int length = 1;
		int value = 42;
		int[] actuals = Methods.filledArray(length, value);
		assertNotNull(actuals);
		assertEquals(length, actuals.length);
		int[] expecteds = { value };
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testArrayLength2() {
		int length = 2; // Desired length of the array
		int value = 4; // Value to fill the array with
		int[] actuals = Methods.filledArray(length, value); // Call the method
		assertNotNull(actuals); // Ensure the array is not null
		assertEquals(length, actuals.length); // Check if the array length is correct
		int[] expecteds = { value, value }; // Expected array content
		assertArrayEquals(expecteds, actuals); // Check if the actual array matches the expected
	}

	@Test
	public void testArrayLength4() {
		int length = 4;
		int value = 400;
		int[] actuals = Methods.filledArray(length, value);
		assertNotNull(actuals);
		assertEquals(length, actuals.length);
		int[] expecteds = { value, value, value, value };
		assertArrayEquals(expecteds, actuals);
	}
}
