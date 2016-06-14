package ArrayPrograms;
/*You are given an array of 0s and 1s in random order. 
 * Segregate 0s on left side and 1s on right side of the array. 
 * Traverse array only once.
 */

import java.util.Arrays;

public class zerosAndOnes_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,0,0,0,0};
		int start = 0, end = arr.length-1;
		while(start < end) {
//			System.out.println("cames "+ arr[start]);
			if(arr[start] == 1) {
				if(arr[end] == 0) {
					int temp = arr[end];
					arr[end] = arr[start];
					arr[start] = temp;
					start++;
					end--;
				} else {
					end--;
				}
			} else {
				start++;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
