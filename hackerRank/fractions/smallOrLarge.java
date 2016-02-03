import java.util.*;
class smallOrLarge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer stt = new StringTokenizer(str," ");
		int x = 0,size = 0,queries = 0;
		while(stt.hasMoreTokens()) {
			if(x == 0) {
				size = Integer.parseInt(stt.nextToken());
				x++;
			}
			else{
				queries = Integer.parseInt(stt.nextToken());
			}
		}
		//int size = Integer.parseInt(str.charAt(0)+"");
		//int queries = Integer.parseInt(str.substring(2,str.length()));
		//System.out.println(size);
		//System.out.println(queries);
		ArrayList<Integer> numbers = new ArrayList<>();
		Scanner sc1 = new Scanner(System.in);
		for(int i = 0; i < size ; i++) {
			while(sc1.hasNext()) {
					numbers.add(Integer.parseInt(sc1.next()));
			}
		
		}
		//System.out.println("kkskak");
		//System.out.println(numbers);
		ArrayList<Integer> list = new ArrayList<>();
		//sc.nextLine();
		for(int i = 0; i < queries; i++) {
			//System.out.println(i);
			str = sc.nextLine();
			//System.out.println("str: "+str);
			StringTokenizer st = new StringTokenizer(str," ");
			while(st.hasMoreTokens()) {
				list.add(Integer.parseInt(st.nextToken()));
			}
		}
		//System.out.println(list);
		sc = new Scanner(System.in);
		ArrayList<Integer> numbers2;
		for(int i = 1; i <= queries; i++) {
			numbers2 = new ArrayList<>();
			int count = 0;
			if(list.get(i*3 - 1) == 0) {
				for(int j = 0; j < numbers.size(); j++) {
					if(numbers.get(j)>list.get((i*3) - 3)) {
						//System.out.println("j= "+numbers.get(j)+"l: "+list.get(i*2-1));
						numbers2.add(numbers.get(j));
						count++;
					}
				}
				//System.out.println("in 0+"+ numbers2);
				if(count==0) {
					System.out.println(-1);
				}
				else
				System.out.println(numbers2.get(list.get((i*3) - 2)-1));
			}
			if(list.get(i*3 - 1) == 1) {
				for(int j = 0; j < numbers.size(); j++) {
					if(numbers.get(j)<list.get(i*3 - 3)) {
						numbers2.add(numbers.get(j));
						count++;
					}
				}
				//System.out.println(numbers2);
				if(count==0) {
					System.out.println(-1);
				}
				else
				System.out.println(numbers2.get(list.get((i*3) - 2)-2));
			}
		}

	}
}