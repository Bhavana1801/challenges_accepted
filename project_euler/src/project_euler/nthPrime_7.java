package project_euler;

import java.util.Scanner;

public class nthPrime_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		while(size != 0) {
			int num = Integer.parseInt(sc.nextLine());
			int count = 1;
			if(num == 1) {
				System.out.println(2);
				continue;
			}
			for(int i = 3; true; i+=2) {
				System.out.println("came");
				boolean flag = true;
				for(int j = 2; j <= Math.sqrt(i); j++) {
					//System.out.println("i "+i+" j "+j);
					if(j > 2 && j%2 == 0) {
						continue;
					}
					if(i % j == 0) {
						flag = false;
					}
					
				}
				if(flag) {
					//System.out.println("prime "+ i);
					count++;
				}
				if(count == num) {
					System.out.println(i);
					break;
				}
			}
			System.out.println("came2");
			size--;
		}
		sc.close();
	}

}
