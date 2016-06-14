package ArrayPrograms;

import java.util.Arrays;

public class MaxDiff_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,100,10,1,1};
		Arrays.sort(arr);
		int max = Integer.MIN_VALUE;
		int i = 0;
		while(i < arr.length) {
			int temp;
			if(i == arr.length - 1) {
				temp = Math.abs(arr[i] - arr[0]);
			} else {
				temp = Math.abs(arr[i] - arr[i+1]);
			}
			
			if(max < temp) {
				max = temp;
			}
			System.out.println("temp "+ temp);
			i++;
		}
		System.out.println(max);
	}

}
