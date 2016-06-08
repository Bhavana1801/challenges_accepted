package ArrayPrograms;

public class oddTimes_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,4,41,41,4,3,3};
		int res = 0;
		for(int i = 0; i < arr.length; i++) {
			res = res^arr[i];
		}
		System.out.println(res);
	}

}
