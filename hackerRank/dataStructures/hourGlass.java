import java.util.Scanner;
import java.util.StringTokenizer;
class hourGlass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[6][6];
		int count = 0;
		while(count<6) {
			
			String str = sc.nextLine();
			StringTokenizer st = new StringTokenizer(str," ");
			int i = 0;
			while(st.hasMoreTokens()) {
				array[count][i] = Integer.parseInt(st.nextToken());
				i++;
			}
			count++;
		}
		// for(int i = 0; i< 6; i++) {
		// 	for(int j=0; j< 6; j++) {
		// 		System.out.print(array[i][j]);
		// 	}
		// 	System.out.println();
		// }
	}
}