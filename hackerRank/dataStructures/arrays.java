import java.util.Scanner;
import java.util.StringTokenizer;
class arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine();
		int[] array = new int[size];
		int i = 0;
		StringTokenizer st = new StringTokenizer(str," ");
		while(st.hasMoreTokens()) {
			array[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		for(i = array.length -1; i>=0; i--) {
			System.out.print(array[i]+" ");
		}
	}
}