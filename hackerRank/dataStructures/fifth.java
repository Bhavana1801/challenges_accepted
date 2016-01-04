// You are given a square matrix of size N×N. Calculate the absolute difference of the sums across the two main diagonals.

// Input Format

// The first line contains a single integer N. The next N lines contain N integers (each) describing the matrix.

// Constraints 
// 1≤N≤100 
// −100≤A[i]≤100
// Output Format

// Output a single integer equal to the absolute difference in the sums across the diagonals.

// Sample Input

// 3
// 11 2 4
// 4 5 6
// 10 8 -12
// Sample Output

// 15
// Explanation

// The first diagonal of the matrix is:

// 11
//     5
//         -12
// Sum across the first diagonal = 11+5-12= 4

// The second diagonal of the matrix is:

//         4
//     5
// 10
// Sum across the second diagonal = 4+5+10 = 19 
// Difference: |4-19| =15
import java.util.Scanner;
class fifth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		int[][] matrix = new int[size][size];
		for(int i = 0; i < size; i++) {
			String st = sc.nextLine();
			//System.out.println(st);
			String str[] = st.split(" ");
			for(int j = 0; j < size; j++) {
				matrix[i][j] = Integer.parseInt(str[j]);
			}
		}
		// for(int i = 0; i < size; i++) {
		// 	for(int j =0; j < size; j++) {
		// 		System.out.println(matrix[i][j]);
		// 	}
		// }
		int sum1 = 0, sum2 = 0;
		for(int i = 0; i < size;i++) {
			//System.out.println("i"+i);
			sum1 = sum1 + matrix[i][i];
		}
		//System.out.println("sum"+sum1);
		int j = size -1;
		for(int i = 0; i < size; i++) {
			//System.out.println(i+j);
			sum2 = sum2+matrix[i][j];
			j--;
		}
		int sum = sum1-sum2;
		if(sum<0) {
			System.out.println(-(sum));
			return;
		}
		System.out.println(sum);
	}
}