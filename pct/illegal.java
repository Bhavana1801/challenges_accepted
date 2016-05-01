import java.util.*;
class illegal {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>(1);
		a.add(10);
		a.add(20);
		a.add(20);
		System.out.println(a);
	}
}