package project_euler;

import java.util.Scanner;

public class palindrome_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		while(size != 0) {
			int num = Integer.parseInt(sc.nextLine());
			String prod = "";
			int res = -1;
			for(int i=999;i>=143;i--) {
				for(int j=999;j>=707;j--) {
					prod = Integer.toString(i*j);
                    //if(i*j > )
					String palindrome = new StringBuffer(prod).reverse().toString();
					if(Integer.parseInt(prod) < num && prod.equals(palindrome)) {
						if(Integer.parseInt(prod)> res) {
							//System.out.println(prod);
                            res = Integer.parseInt(prod);
                            break;
                        }
							
					}
				}
			}
				System.out.println(res);
			size--;
		}
		sc.close();
	}

}
