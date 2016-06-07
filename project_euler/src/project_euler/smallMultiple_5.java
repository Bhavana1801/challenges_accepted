package project_euler;

import java.util.Scanner;

public class smallMultiple_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		boolean flag = false;
		while(size != 0) {
			int num = Integer.parseInt(sc.nextLine());
			int n = num+1;
			int i = 2;
			while(i <= num) {
				//System.out.println("n "+n+" i "+i);
				if(n % i == 0) {
					i++;
					flag = true;
				} else{
					flag = false;
				}
				if(flag == false) {
					n++;
				}
				if(i == num) {
					i=2;
				}
				
			}
			System.out.println(n);
			size--;
		}
		sc.close();
	}

}
