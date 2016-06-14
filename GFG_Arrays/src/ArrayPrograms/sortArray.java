package ArrayPrograms;

import java.util.Arrays;

public class sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,2,0,1,2,0,1,2};
		int start = 0, end = start + 1;
		while(end < arr.length) {
			if(arr[start] < arr[end]) {
				System.out.println("if");
				start++;
			} else {
				System.out.println("else");
				int temp = arr[end];
				arr[end] = arr[start];
				arr[start] = temp;
				start++;
				end++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
