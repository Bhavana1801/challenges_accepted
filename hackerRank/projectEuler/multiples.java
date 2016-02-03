//problem 1
// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

// Find the sum of all the multiples of 3 or 5 below N.

// Input Format 
// First line contains T that denotes the number of test cases. This is followed by T lines, each containing an integer, N.

// Output Format 
// For each test case, print an integer that denotes the sum of all the multiples of 3 or 5 below N.

// Constraints 
// 1≤T≤105 
// 1≤N≤109

// Sample Input

// 2
// 10
// 100
// Sample Output

// 23
// 2318
import java.util.*;
import java.math.BigInteger;
class multiples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i =0; i < n; i++) {
			sum obj = new sum();
			BigInteger limit = Integer.parseInt(sc.nextLine());
			BigInteger res = obj.sumOfMultiples(3,limit)+obj.sumOfMultiples(5,limit) - obj.sumOfMultiples(15,limit);
			System.out.println(res);
		}
	}
}
class sum {
	public BigInteger sumOfMultiples(BigInteger num,BigInteger limit){
		BigInteger numOfMultiples = (limit-1)/num;
		return num*(numOfMultiples*(numOfMultiples+1)/2);
	}
}