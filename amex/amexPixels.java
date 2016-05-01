import java.util.*;
class amexPixels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int i = 0;
		// ArrayList<ArrayList<Integer>> allValues = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
		StringTokenizer st;
		while(i < num) {
			String str = sc.nextLine();
			st = new StringTokenizer(str," ");
			while(st.hasMoreTokens()) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			i++;
		}
		int logoSize = list.get(0)*list.get(1);
		int count = 0;
		int templatePixels = 5*logoSize+5;
		int j = templatePixels;
		for(i = 5; i < templatePixels-1;++i) {
			if(list.get(i) == list.get(j)) {
				count++;
			}
			j++;
		}
		i = 1;
		if(count == logoSize) {
			System.out.println("Y");
			System.out.println((i+1)+" "+i);
		}
		else
			System.out.println("N");
	}
}