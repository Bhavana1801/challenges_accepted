import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;
class StringTokeniser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		ArrayList<String> list = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(str," ,'?!._@");
		//int count = 0;
		while(st.hasMoreTokens()) {
			//count++;
			list.add(st.nextToken());
		}
		System.out.println(list.size());
		for(int i = 0; i < list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}