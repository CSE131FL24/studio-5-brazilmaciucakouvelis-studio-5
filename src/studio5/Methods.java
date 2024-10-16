package studio5;

import java.util.Arrays;

import edu.princeton.cs.introcs.StdDraw;

public class Methods {

	/**
	 * Compute the (Euclidean) distance between two points.
	 *
	 * @param x1 x-coordinate of a point
	 * @param y1 y-coordinate of a point
	 * @param x2 x-coordinate of another point
	 * @param y2 y-coordinate of another point
	 * @return the Euclidean distance between (x1,y1) and (x2,y2)
	 */
	public static double distanceBetween(double x1, double y1, double x2, double y2) {
		double distance = 0;
		// FIXME: Hint use Math methods (e.g. Math.sqrt) to compute the distance
		distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return distance;
	}

	/**
	 * Draw a bull's eye at the given location with the given radius.
	 *
	 * @param x      the x coordinate of the center of the bull's eye
	 * @param y      the y coordinate of the center of the bull's eye
	 * @param radius the radius of the bull's eye
	 */
	public static void drawBullsEye(double x, double y, double radius) {
		// Draw the central black circle
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x, y, radius);

		// Draw the blue ring (3/4 of the main radius)
		StdDraw.setPenColor(0, 109, 219); // Set color to blue
		StdDraw.filledCircle(x, y, radius * 3.0 / 4.0); // Draw blue ring

		// Draw the red ring (1/2 of the main radius)
		StdDraw.setPenColor(146, 0, 0); // Set color to red
		StdDraw.filledCircle(x, y, radius * 1.0 / 2.0); // Draw red ring

		// Draw the yellow ring (1/4 of the main radius)
		StdDraw.setPenColor(255, 255, 109); // Set color to yellow
		StdDraw.filledCircle(x, y, radius * 1.0 / 4.0); // Draw yellow ring
	}

	/**
	 * Return a new String which is the original source String with all occurrences
	 * of the target character substituted by the replacement String.
	 * 
	 * @param source      the source String
	 * @param target      the target character to be replaced
	 * @param replacement the replacement String
	 * 
	 * @return the String which results from substituting all of the target
	 *         characters in the source String with the replacement String
	 */
	public static String substituteAll(String source, char target, String replacement) {
		String result = "";
		// TODO: Finish this method

		return result;
	}

	/**
	 * Compute the sum of elements in an array
	 * 
	 * @param values an array of integers
	 * @return the sum of the elements in values
	 */
	public static int arraySum(int[] values) {
		int sum = 0;

		// Iterate over each element in the array and add to sum
		for (int i = 0; i < values.length; i++) {
			sum += values[i]; // Add current element to sum
		}

		return sum; // Return the total sum
	}

	/**
	 * Return an array of a given size filled with the provided value
	 * 
	 * @param length the length of the returned array
	 * @param value  the value to fill the array with
	 * @return and array of size that's filled with value
	 */
	public static int[] filledArray(int length, int value) {
		// Create an array of the specified length
		int[] values = new int[length];

		// Fill the array with the specified value
		for (int i = 0; i < values.length; i++) {
			values[i] = value; // Assign the value to each element in the array
		}

		return values; // Return the filled array
	}

	// TODO: Create an arrayMean method which accepts an int array of values
	// parameter.
	public static double arrayMean(int[] values) {
		// Calculate and return the mean in one line using stream
		return values.length == 0 ? 0 : (double) Arrays.stream(values).sum() / values.length;
	}

	// TODO: Create a JavaDoc comment for the arrayMean method.

}
