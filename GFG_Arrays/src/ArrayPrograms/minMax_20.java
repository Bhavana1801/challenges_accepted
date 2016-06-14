package ArrayPrograms;
/*Write a C function to return minimum and maximum in an array. 
 * You program should make minimum number of comparisons. 
 */

public class minMax_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 13, 1, 10, 34, 1};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i ++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(min + " "+ max);
	}

}
