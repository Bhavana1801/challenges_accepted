package chapter1;
//replace spaces with %20
public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Mr Jo hn Smith      ";
		String 	st = "%20";
		System.out.println(str+"*"+str.length());
		for(int i = 0; i < str.length(); i++) {
			int end = str.length();
			char temp = str.charAt(i);
			if(temp == ' ') {
				end+=-2;
				str = str.substring(0,i)+st+str.substring(i+1,end);
				System.out.println(str+"*"+str.length());
			}
		}
		System.out.println(str+"*"+str.length());
	}
}
