import java.util.*;
class amexTripping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		ArrayList<String> firstData = new ArrayList<>();
		ArrayList<String> secondData = new ArrayList<>();
		int i  = 0;
		while(i < num) {
			String str = sc.nextLine();
			StringTokenizer st = new StringTokenizer(str," ");
			while(st.hasMoreTokens()) {
				firstData.add(st.nextToken());
			}
			i++;
		}
		i = 0;
		num = Integer.parseInt(sc.nextLine());
		while(i < num) {
			String str = sc.nextLine();
			StringTokenizer st = new StringTokenizer(str," ");
			while(st.hasMoreTokens()) {
				secondData.add(st.nextToken());
			}
			i++;
		}
		System.out.println(firstData.size()/6);
		System.out.println(secondData.size()/6);
	}
}