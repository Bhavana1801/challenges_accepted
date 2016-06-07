package project_euler;
import java.util.*;
public class primeFact_3 {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int size = Integer.parseInt(sc.nextLine());
			int max = 0;
			while(size != 0) {
				int num = Integer.parseInt(sc.nextLine());
				int digit = 2;
				max = 0;
				while(Math.sqrt(num) > 1) {
					while(num % digit == 0 ) {
						if(max < digit)
							max = digit;
						num = num/digit;
					}
					digit = digit + 1;
					if(digit%2 == 0) {
						digit = digit+1;
					}
					//System.out.println(digit);
				}
				System.out.println(max);
				size--;
			}
			
			sc.close();
		}
}
