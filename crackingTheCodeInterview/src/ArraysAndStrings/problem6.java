/** rotate an image by 90degrees.
 * 
 */
package ArraysAndStrings;

import java.util.Arrays;

/**
 * @author bhavs
 *
 */
public class problem6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// not understood
		// TODO Auto-generated method stub
		int matrix[][] = {	{1,2,3,4},
							{5,6,7,8},
							{9,10,11,12},
							{13,14,15,16}
						};
		System.out.println(matrix.length);
		for(int i = 0; i < matrix.length;i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		for(int i = 0; i < matrix.length; i++) {
			int first = i;
			int last = matrix.length - 1 - i;
			for(int x = first; x<last;x++) {
				int offset = x-first;
				int top = matrix[first][x];
				matrix[first][x] = matrix[last-offset][first];
				matrix[last-offset][first] = matrix[last][last-offset];
				matrix[last][last-offset] = matrix[x][last];
				matrix[x][last] = top;
			}
		}
		for(int i = 0; i < matrix.length;i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}

	}
	

}
