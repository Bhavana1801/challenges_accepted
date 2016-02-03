import java.util.*;
public class vowcon {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str," ,.?");
		while(st.hasMoreTokens()) {
			words.add(st.nextToken().toLowerCase());
		}

		//System.out.println(words);
		for(int i = 0; i < words.size();i++) {
			int count = 0;
			String temp = words.get(i);
			//System.out.println(temp);
			for(int j = 0; j < temp.length(); j++) {
				if((int)temp.charAt(j)>=65 && (int)temp.charAt(j)<=90) {
					count++;
				}
				else if((int)temp.charAt(j)>=97 &&(int)temp.charAt(j)<=122) {
					count++;
				}
			}
			//System.out.println(count);
			if(count != temp.length() || temp.length()<2) {
				words.remove(i);
				i--;
			}
		}
		ArrayList<String> vowels = new ArrayList<>();
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
		vowels.add("o");
		vowels.add("u");
		vowels.add("y");
		//System.out.println(words);
		int finalCount =0;
		for(int i = 0; i < words.size(); i++) {
			boolean vowCount = true;
			boolean conCount = true;
			String word = words.get(i);
			// System.out.println(word.charAt(0)+"");
			if(vowels.contains(word.charAt(0)+"")) {
				// System.out.println("came");
				for(int j = 0; j < word.length();j++) {
					// System.out.println(j+"  "+word.charAt(j));
					if(j%2 == 0 && !vowels.contains(word.charAt(j)+"")) {
						// System.out.println("even");
						// System.out.println(word.charAt(j));
						vowCount =false;
					}
					if(j%2 == 1 && vowels.contains(word.charAt(j)+"")) {
						// System.out.println("even2");
						// System.out.println(word.charAt(j));
						conCount =false;
					}
				}
			}
			if(!vowels.contains(word.charAt(0)+"")) {
				// System.out.println("came");
				for(int j = 0; j < word.length();j++) {
					System.out.println(j+"  "+word.charAt(j));
					if(j%2 == 0 && vowels.contains(word.charAt(j)+"")) {
						// System.out.println("even");
						// System.out.println(word.charAt(j));
						vowCount =false;
					}
					if(j%2 == 1 && !vowels.contains(word.charAt(j)+"")) {
						// System.out.println("even2");
						// System.out.println(word.charAt(j));
						conCount =false;
					}
				}
			}
			if(vowCount==true && conCount == true) {
				finalCount++;
				System.out.println("final word");
				System.out.println(word);
			}
		}
		System.out.println(finalCount);
	}
}
