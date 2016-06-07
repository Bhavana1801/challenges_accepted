package project_euler;
import java.util.Scanner;

public class mult3and5_1 {
	public static void main(String args[]) {
		findMult obj = new findMult();
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n ; i++) {
			long num = Integer.parseInt(sc.nextLine()) - 1;
			//System.out.println("num= "+ num);
			System.out.println(obj.getSum(num/3)*3 + obj.getSum(num/5)*5 - obj.getSum(num/15)*15);
			
		}
		sc.close();
	}
}
class findMult {
	public long getSum(long num) {
		//System.out.println("num "+num+"value "+num*(num+1)/2);
		return num*(num+1)/2;
	}
}

