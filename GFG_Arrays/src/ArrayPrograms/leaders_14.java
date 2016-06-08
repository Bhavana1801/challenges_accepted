package ArrayPrograms;
/*Write a program to print all the LEADERS in the array. 
 * An element is leader if it is greater than all the elements to its right side.
 *  And the rightmost element is always a leader. 
For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.*/
public class leaders_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,9,8,7,6};
		int max = arr[arr.length-1];
		for(int i = arr.length - 1; i >= 0; i --) {
			if(max < arr[i]) {
				max = arr[i];
				System.out.print(max+" ");
			}
		}
	}

}
