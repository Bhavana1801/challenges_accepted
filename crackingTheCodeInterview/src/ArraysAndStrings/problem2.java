package ArraysAndStrings;
//reverse a string
public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "manchana";
//		System.out.println(str.length());
		int start  = 0, end = str.length()-1;
		while(start < end) {			
			String temp1 = str.charAt(start)+"";
			String temp2 = str.charAt(end)+"";
			str = str.substring(0, start)+temp2+str.substring(start+1,end)+temp1+str.substring(end+1,str.length());
			start++;
			end--;
			
		}
		System.out.println("***\n"+str);
		
	}

}
