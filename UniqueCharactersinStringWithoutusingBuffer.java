package Examples;
/*Create a class for finding unique characters in a string.
 * using bit operators.
 */
public class UniqueCharactersinStringWithoutusingBuffer {

	public static boolean MethodforUniq(String str) {

		int cheker = 0;
		for (int indexofstring = 0; indexofstring < str.length(); indexofstring++) {
			int bitmapindex = str.charAt(indexofstring) - 'a';
			if ((cheker & (1 << bitmapindex)) > 0) {
               System.out.println("characters are not unique");
				return false;

			}
			cheker = (cheker | (1 << bitmapindex));

		}
		System.out.println("characters are unique");
		return true;

	}

	public static void main(String args[]) {
		String str = "madam";
		MethodforUniq(str);
	}

}
