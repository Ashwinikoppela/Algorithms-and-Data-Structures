package Examples;
/*@Author : Ashwini.
 * Create a class for finding Unique values in int[] array.
 */

import java.util.*;

public class UniqueValuesinArray {
	public static void uniquevalues(int[] array) {
		Set<Integer> setofvalues = new TreeSet<Integer>();

		for (int indexofarray = 0; indexofarray < array.length; indexofarray++) {

			int value = Math.abs(array[indexofarray]) - 1;
			if (array[value] > 0) {
				array[value] = -array[value];
			} else {
				setofvalues.add(Math.abs(array[value]));

			}

		}
		System.out.println(setofvalues);

	}

	public static void main(String args[]) {
		int[] arrayofentries = { 1, 2, 4, 1, 5 };
		uniquevalues(arrayofentries);
	}

}
