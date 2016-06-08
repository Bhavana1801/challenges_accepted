package ArrayPrograms;
/*You are given a list of n-1 integers and these integers are in the range of 1 to n. 
 * There are no duplicates in list. One of the integers is missing in the list. 
 * Write an efficient code to find the missing integer.
 */
public class FindMissingNum_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		int sum = (arr.length+1)*(arr.length+2)/2;
		for(int i = 0; i < arr.length ; i ++) {
			sum = sum - arr[i];
		}
		System.out.println(sum);
		
	}

}
