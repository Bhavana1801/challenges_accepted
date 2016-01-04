import java.util.*;
import java.math.*;
class bigInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger num1 = sc.nextBigInteger();
		BigInteger num2 = sc.nextBigInteger();
		BigInteger sum = num1.add(num2);
		BigInteger prod = num1.multiply(num2);
		System.out.println(sum);
		System.out.println(prod);
	}
}