package project_euler;

import java.util.Scanner;

public class pythTriplet_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		boolean flag = true;
		while(size != 0) {
			int num = Integer.parseInt(sc.nextLine());
			int res = -1;
			for(int a = 1; a < 3000 && flag; a++) {
				for(int b = a+1; b < 3000; b++) {
					int c = num-a-b;
					
					if(a*a + b*b == c*c && c > 0 ) {
						//System.out.println("a "+a+" b "+b+ " c "+c);
						flag = false;
						res = a*b*c;
						
					}
				}
			}
			System.out.println(res);
			size--;
		}
		sc.close();
	}

}
