/**
 * 
 */
package chapter1;

/**
 * @author bhavs
 *
 */
public class problem8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		String x = "";
		String y = "";
		int start = 1;
		int end = s1.length();
		if(s1.length() != s2.length()) {
			System.out.println("false");
			System.exit(0);
		}
		while(start < end) {
			x = s1.substring(0,start);
			y = s1.substring(start,end);
			System.out.println(x+"\t"+y);
			start++;
			if((x+y).equals(s1) && (y+x).equals(s2)) {
				System.out.println("true");
				break;
			}
		}

	}

}
