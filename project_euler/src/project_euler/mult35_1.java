package project_euler;
import java.util.Scanner;
public class mult35_1 {
	public static void main(String args[]) {
		findMul obj = new findMul();
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n ; i++) {
			int num = Integer.parseInt(sc.nextLine());
			obj.getSum(num);
			
		}
		sc.close();
	}
}
class findMul {
	public void getSum(int num) {
		int sum = 0;
		for(int i = 3,j = 5; i < num; i = i+3,j=j+5) {
			System.out.println("i "+i+"j "+j);
			if(i%3 == 0) {
				sum = sum + i;
			}
			if(j >= num) continue;
            if(j%5 == 0 && j%3 != 0) {
            	
                 sum = sum + j;
            }
            System.out.println("sum "+sum);
		}
		System.out.println(sum);
	}
}
