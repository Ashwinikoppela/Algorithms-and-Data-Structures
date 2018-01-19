package Examples;
/*Author : Ashwini.
 *  Create a class for Dynamic Programming 
 * Identifies longest common subsequence in a given string.
 */

public class DynamicProgramming {
	public static void commonsubsequence(String str1, String secondstring) {
		int[][] matrix = new int[str1.length() + 1][secondstring.length() + 1];

		for (int indexoffirststring = 0; indexoffirststring <= str1.length(); indexoffirststring++) {
			for (int lengthof = 0; lengthof <= secondstring.length(); lengthof++) {
				if (indexoffirststring == 0 || lengthof == 0) {
					matrix[indexoffirststring][lengthof] = 0;
				}

				else if (str1.charAt(indexoffirststring - 1) == secondstring.charAt(lengthof - 1)) {
					matrix[indexoffirststring][lengthof] = matrix[indexoffirststring - 1][lengthof - 1] + 1;

				} else {
					matrix[indexoffirststring][lengthof] = Math.max(matrix[indexoffirststring][lengthof - 1],
							matrix[indexoffirststring - 1][lengthof]);
				}
			}
		}

		int index = matrix[str1.length()][secondstring.length()];
		char[] chararray = new char[index+1];
		int m = str1.length();
		int n = secondstring.length();
		while (m > 0 && n > 0) {
			if (str1.charAt(m - 1) == secondstring.charAt(n - 1)) {
				chararray[index] = str1.charAt(m - 1);
				m--;
				n--;
				index--;
			} else if (matrix[m - 1][n] > matrix[m][n - 1]) {
				m--;

			} else {
				n--;
			}
		}
		for (int i = 0; i < chararray.length; i++) {
			System.out.print(chararray[i]);
		}

	}

	public static void main(String args[]) {
		String str1 = "AGGTAB";
		String second = "GXTXAYB";
		commonsubsequence(str1, second);

	}

}
