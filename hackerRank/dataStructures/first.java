/*Problem Statement

This is an introductory challenge. The purpose is to give you a working I/O template in your preferred language and to get you familiar with HackerRank challenges.

The given code scans two numbers from STDIN, finds their sum, and prints it on STDOUT. The code has been provided for most of the popular languages for you to read and inspect how the IO is handled.

Note: The code has been saved in a template, which you can submit if you want. Or, you may try rewriting it and building it up from scratch.

Input Format 
Number A and B on two different lines.

Output Format 
An integer representing the sum of the given numbers.

Constraints 
(This section describes the range of the expected input. As an example here given below, A and B will never be below 1 or above 1000.) 
1≤A,B≤1000
Sample Input

2
3
Sample Output

5*/
import java.util.Scanner;
class first {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.print("\n"+(x+y));
	}
}