package project_euler;

import java.util.Scanner;

public class SumSquare_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		while(size != 0) {
			int num = Integer.parseInt(sc.nextLine());
			long sum1 = 0;
			long sum2 = 0;
			for(int i = 1; i <= num; i++) {
				sum1 = sum1 + (i*i);
				sum2 = sum2 + i;
			}
			sum2 = sum2 * sum2;
			System.out.println(Math.abs(sum2-sum1));
			size--;
		}
		sc.close();
	}

}
