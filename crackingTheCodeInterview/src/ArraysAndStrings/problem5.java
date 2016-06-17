package ArraysAndStrings;
//aabcccccaaa
//output: a2b1c5a3
public class problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";
		char prev = str.charAt(0);
		char current;
		int count = 1;
		String st="";
		for(int i =1; i < str.length();i++) {
			current = str.charAt(i);
			if(prev == current) {
				count++;
			} else {
				st = st+prev+""+count;
				prev = current;
				count = 1;
			}
		}
		st = st+prev+count;
		//if the compressed string is larger than the main string should print main string
		if(str.length() < st.length()) {
			System.out.println(str);
		} else {
			System.out.println(st);
		}

	}

}
