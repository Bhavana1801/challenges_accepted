import java.util.*;
class arrays2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limit = Integer.parseInt(sc.nextLine());
		Hashtable<String,String> names = new Hashtable<String,String>();
		
		for(int i =0; i < limit*2; i++) {
			if(i<limit) {
				names.put(sc.nextLine(),sc.nextLine());
			}
			else {
				String name = sc.nextLine();
				
				if(names.containsKey(name)) {
					System.out.println("name="+names.get(name));
				}
				else {
					System.out.println("Not found");
				}
			}
			
		}
	}
}