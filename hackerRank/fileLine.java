import java.util.Scanner;
class fileLine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int i = 1;
		while(sc.hasNextLine()) {
			while((str = sc.nextLine())!=null) {
			System.out.println(i + " "+ str);
			i++;				
			}
	
		}
	}
}