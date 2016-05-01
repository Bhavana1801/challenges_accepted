import java.util.*;
class amexDigital {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		ArrayList<String> enrollmentData = new ArrayList<>();
		ArrayList<String> spendData = new ArrayList<>();
		int i  = 0;
		while(i < num) {
			String str = sc.nextLine();
			StringTokenizer st = new StringTokenizer(str," ");
			while(st.hasMoreTokens()) {
				enrollmentData.add(st.nextToken());
			}
			i++;
		}
		i = 0;
		num = Integer.parseInt(sc.nextLine());
		while(i < num) {
			String str = sc.nextLine();
			StringTokenizer st = new StringTokenizer(str," ");
			while(st.hasMoreTokens()) {
				spendData.add(st.nextToken());
			}
			i++;
		}
		// System.out.println(enrollmentData.size()/6);
		// System.out.println(spendData.size()/4);
	}
}