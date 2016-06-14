package ArrayPrograms;
/*Write an efficient C program to find smallest and second smallest element in an array.

Example:

Input:  arr[] = {12, 13, 1, 10, 34, 1}
Output: The smallest element is 1 and 
        second Smallest element is 10
*/

public class twoMin_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 13, 1, 10, 34, 1};
		int first,second;
		first = second = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			//System.out.println(first + " "+ second);
			if(arr[i] < first) {
				second = first;
				first = arr[i];
			}
			else if(arr[i] < second && arr[i] != first) {
				//System.out.println("sec "+" first "+second+ " "+first);
				second = arr[i];
			}
		}
		System.out.println(first+" "+ second);
	}

}
