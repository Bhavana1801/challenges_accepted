/**
 * 
 */
package ArraysAndStrings;

import java.util.Arrays;

/**
 * @author bhavs
 *
 */
public class problem7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = {	{1,2,3,4},
				{5,0,7,8},
				{9,10,0,12},
			};
		boolean row[] = new boolean[matrix.length];
		boolean column[] = new boolean[matrix[0].length];
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
//					System.out.println(i+"\t"+j);
				}
			}
		}
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				if(row[i] || column[j]) {
					matrix[i][j] = 0;
				}
			}
		}
		for(int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

}
