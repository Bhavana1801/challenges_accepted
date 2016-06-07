package project_euler;
import java.util.*;
public class fibonacci_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		long num1 = 2;
		long num2 = 3;
		long sum = 2;
		long temp = 0;
		for(int i = 0; i < n; i ++) {
			long num = Integer.parseInt(sc.nextLine());
			for(int j = 2; j < num; j++) {
				
				temp = num1 + num2;
				if(temp > num || num2 >= 4000000) {
					break;
				}
//				System.out.println(temp);
				if(temp %2 ==0) {
					sum = sum + temp;
				}
				num1 = num2;
				num2 = temp;	
			}
			if(num < 2) {
				System.out.println(0);
			} 
			else {
			System.out.println(sum);
			}
			
		}
		sc.close();
	}
}
