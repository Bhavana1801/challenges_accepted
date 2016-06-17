/**check if string has unique characters
 * without any use of additional data structures.
 */
package ArraysAndStrings;

/**
 * @author bhavs
 *
 */
public class problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if string is ASCII
		String str = "ael worz";
		if(str.length()>256) {
			System.out.println("error");
			System.exit(0);
		}
		boolean arr[] = new boolean[256];
		for(int i = 0; i < str.length(); i++) {
			int value = str.charAt(i);
//			System.out.println(arr[value]);
			if(arr[value] == false) {
				arr[value] = true;
			} else {
				System.out.println("string is not unique");
				System.exit(0);
			}
		}
		System.out.println("string is unique");

	}

}
