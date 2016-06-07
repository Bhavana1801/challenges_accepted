package project_euler;

import java.util.Scanner;

public class SumOfPrimes_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		while(size != 0) {
			long num = Integer.parseInt(sc.nextLine());
			long sum = 2;
			if(num<2) {
				System.out.println(num);
				continue;
			}
			for(int i = 3; i <= num ; i+=2) {
				//System.out.println("came "+i);
				boolean flag = true;
				for(int j = 2; j <=Math.sqrt(i); j++) {
					//System.out.println("i "+i+" j "+j);
					if(j>2 && j%2 == 0) {
						continue;
					}
					if(i%j == 0) {
						flag = false;
						break;
					}
				}
				if(flag) {
					sum = sum + i;
				}
			}
			System.out.println(sum);
			size--;
		}
		sc.close();
	}

}
