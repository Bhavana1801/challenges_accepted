package ArrayPrograms;
import java.util.Arrays;
//finding the reverse without new array
public class ReverseArray_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int start = 0, end = arr.length - 1;
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	//tring[] array = new String[] {"John", "Mary", "Bob"};
	System.out.println(Arrays.toString(arr));

	}
}
