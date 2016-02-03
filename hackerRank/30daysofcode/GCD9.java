import java.util.*;

class GCD9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int GCD = GCD(x,y);
		System.out.println(GCD);
	}
	static int GCD(int a,int b) {
		if(a == b) {
			return a;
		}
		else {
			int a1 = Math.max(a,b)-Math.min(a,b);
			int b1 = Math.min(a,b);
			return GCD(a1,b1);
		}
	}
}