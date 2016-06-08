package ArrayPrograms;
import java.util.Hashtable;
public class pairSum_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,4,45,6,10,8,7};
		int sum = 10;
		boolean flag = false;
		Hashtable<Integer,Integer> hash = new Hashtable<>();
		for(int i = 0; i < arr.length;i++) {
			int temp = sum - arr[i];
			if(hash.containsKey(temp)) {
				System.out.println(temp+" "+arr[i]);
				flag = true;
			} else {
				hash.put(arr[i], 1);
			}
		}
		if(flag == false)
			System.out.println("no elements found");
		
	}

}
