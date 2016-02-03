import java.util.Scanner;
import java.util.ArrayList;
class StringCompare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		ArrayList<String> list = new ArrayList<>();
		int l = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < str.length(); i++) {
			if(i > str.length()-l) {
				break;
			}
			list.add(str.substring(i,i+l));
		}
		//System.out.println(list);
		int high =0;
		String highS =list.get(0);
		String lowS = list.get(0);
		int low = 0;
		//System.out.println("a".compareTo("c"));
		//System.out.println("wel".compareTo("jav"));

		for(int j = 0; j< list.size();j++) {
			if(list.get(j).compareTo(highS) >= 0) {
				highS = list.get(j);
			}
			else if(list.get(j).compareTo(lowS)<= -1){
				lowS = list.get(j);
			}
			//System.out.println(highS+" "+lowS);
		}
		System.out.println(lowS);
		System.out.println(highS);
		
	}
}