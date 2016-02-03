import java.util.Scanner;
public class exx {
	public static void main(String[] args) {
		int i=1,j=1;
		int count=0;
		Scanner sc = new Scanner(System.in);
		i =sc.nextInt();
		j=sc.nextInt();
		//System.out.println(i+j);
		calculate obj = new calculate(i,j);
		obj.method();
		//
	}
}
class calculate {
	int i,j;
	calculate(int i,int j) {
		//System.out.println(i+","+j);
		this.i = i;
		this.j =j;
	}
	public void method() {
		//.out.println("n");
		int n = i;
		int count =1;
		//System.out.print(n+" ");
		int temp;
		while(n!=1) {
			//System.out.println("temp"+temp);
			if(n%2 == 0) {
				System.out.print(n+" ");
				n = n/2;
				count++;
			}
			else if(n%2==1){
				n= 3*n + 1;
				System.out.print(n+" ");
				n = n/2;
				//n = temp;
				count = count+2;
			}
		}
		System.out.println("--->"+count);
	}
}