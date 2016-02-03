import java.util.*;
import java.io.*;
class binary10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		for(int i = 0; i < limit ; i++) {
			StringBuffer res = new StringBuffer(binary(sc.nextInt()));
			res = res.reverse();
			System.out.println(res);
		}
	}
	static String binary(int num) {
		String res="";
		while(num != 0) {
			res = res+num%2;
			num = num/2;
		}
		return res;
	}
}