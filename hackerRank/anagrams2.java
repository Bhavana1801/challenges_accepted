import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class anagrams2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next().toLowerCase();
		String s2 = sc.next().toLowerCase();
		ArrayList<Character> list1 = new ArrayList<>();
		ArrayList<Character> list2 = new ArrayList<>();
		for(int i = 0; i < s1.length();i++) {
			list1.add(s1.charAt(i));
		}
		for(int i = 0; i < s2.length(); i++) {
			list2.add(s2.charAt(i));
		}
		Collections.sort(list1);
		Collections.sort(list2);
		int count = 0;
		if(list1.size()!=list2.size()) {
			count = 0;
		}
		else {
			for(int j =0; j < list1.size(); j++) {
				if(list1.get(j)!=list2.get(j)) {
					//System.out.println("Not Anagrams");
				}
				else {
					count++;
					//System.out.println("Anagrams");
				}
			}
		}
		if(count == list1.size()) {
			System.out.println("Anagrams");
		}
		else {
			System.out.println("Not Anagrams");
		}
	}
}