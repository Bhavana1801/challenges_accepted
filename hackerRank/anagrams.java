import java.util.Scanner;
class anagrams {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int count = 0;
		for(int i = 0; i < s2.length(); i++) {
			for(int j = 0; j < s1.length(); j++) {
				if(s2.charAt(i) == s1.charAt(j)) {
					int temp = s1.indexOf(s1.charAt(j));
					if(temp == 0) {
						s1 = s1.substring(1,s1.length());
						count++;
					}
					else if(temp == s1.length()-1) {
						s1 = s1.substring(0,temp);
						count++;
					}
					else {
						s1 = s1.substring(0,temp)+s1.substring(temp+1,s1.length());
						count++;
					}
				}
			}
		}
		if(count == s2.length() && s1.equals("")) {
			System.out.println("Anagrams");
		}
		else {
			System.out.println("Not Anagrams");
		}
	}
}