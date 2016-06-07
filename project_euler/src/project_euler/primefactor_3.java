package project_euler;

import java.util.Scanner;

public class primefactor_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		int max = 0,digit =3;
		boolean flag = false;
		while(size != 0) {
			int num = Integer.parseInt(sc.nextLine());
			
			while(num%2 == 0) {
				num = num/2;
				if(num == 1) {
					flag = true;
					max = 2;
					//System.out.println("in if");
					break;
				}
				//System.out.println("num "+num);
			}
			if(!flag) {
				System.out.println(" flag num "+num + "sqrt "+Math.sqrt(num));
				while(digit <= Math.sqrt(num)) {
					System.out.println("num "+num+" digit "+digit);
					if(num % digit == 0) {
						num = num/digit;
					}
					digit = digit+2;
				}
				if(num > 2) {
					max = num;
				} else {
					max = digit;
				}
			}
			System.out.println(max);
			size--;
		}
		sc.close();

	}

}
