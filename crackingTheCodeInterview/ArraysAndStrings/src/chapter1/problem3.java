package chapter1;
//check whether two strings are permutations of each other

public class problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "g1od ";
		String str2 = "d 1og";
		if(str1.length() != str2.length()) {
			System.out.println("Not anagrams");
		} else {
			int arr[] = new int[256];
			for(int i = 0;i < str1.length(); i++) {
				int value = str1.charAt(i);
				arr[value]++;
			}
			for(int i = 0; i < str2.length();i++) {
				int value = str2.charAt(i);
				if(arr[value]-- == 0) {
					System.out.println("Not anagrams");
					System.exit(0);
				}
			}
			System.out.println("Anagrams");
		}
	}

}
