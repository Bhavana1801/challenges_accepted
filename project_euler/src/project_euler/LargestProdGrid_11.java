package project_euler;

import java.util.Arrays;
import java.util.Scanner;

public class LargestProdGrid_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[][] arr = new String[20][20];
		for(int i = 0; i < 20 ;i++) {
			String str = sc.nextLine();
			arr[i] = str.split(" ");
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
		

	}

}
