package ArrayPrograms;
/*Write an efficient C program to find the sum of contiguous subarray 
 * within a one-dimensional array of numbers which has the largest sum.
 */
public class highSum_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		int max = 0;
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			temp = temp + arr[i];
			//System.out.println("temp="+temp+" arr "+arr[i]);
			if(temp < 0)
				temp = 0;
			if(max < temp) {
				max = temp;
			}
		}
		System.out.println(max);
	}
}
