package project_euler;

import java.util.Scanner;

public class prodOfCons_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		while(size != 0) {
			int numSize = sc.nextInt();
			int subSize = sc.nextInt();
			String num = sc.next();
			//System.out.println(numSize+" "+sub+" "+num);
			long max = 0;
			int start = 0, end;
			
			while(start < numSize - subSize) {
				int prod = 1;
				end = start+subSize;
				//System.out.println("start "+start+" end ="+end);
				for(int i = start; i < end; i++) {
					//System.out.println("starts "+start+" end ="+end);
					prod = prod*Integer.parseInt(num.charAt(i)+"");
					
				}
				//System.out.println(prod);
				if(max < prod) {
					max = prod;
				}
				start++;
			}
			System.out.println(max);
			size--;
		}
		sc.close();
	}

}
