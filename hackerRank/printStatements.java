import java.util.Scanner;
class printStatements {
	public static void main(String[] args) {
		int a;
		int b;
		int n;
		int t;//test cases.
		Scanner in = new Scanner (System.in);
		t = in.nextInt();
		int i;
		for(i = 0; i < t; i++) {
			a = in.nextInt();
			b = in.nextInt();
			n = in.nextInt();
			int j;
			int k;
			int sum=0;
			for(j =1; j <= n; j++) {
				sum=a;
				for(k = 0; k<j;k++) {
					sum=sum+(int)(Math.pow(2,k)*b);
				}
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	}
}