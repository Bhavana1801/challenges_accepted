// Problem Statement

// You are given an array of integers of size N. You need to print the sum of the elements of the array.

// Input Format 
// The first line of the input consists of an integer N. The next line contains N space-separated integers describing the array.

// Constraints 
// 1≤N≤1000 
// 0≤A[i]≤1000

// Output Format 
// Output a single value equal to the sum of the elements of the array.

// Sample Input

// 6
// 1 2 3 4 10 11
// Sample Output

// 31
import java.util.Scanner;
class third {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] nums = new int[num];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum = sum+nums[i];
		}
		System.out.println(sum);
	}
}