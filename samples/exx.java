abstract class exx1 {
	// exx1(){
	// 	System.out.println("constructor");
	// }
	void method() {
		System.out.println("exx1");
	 }
	 void method2(){
	 	System.out.println("first");
	 }

}
class ex extends exx1{
	ex(){
		super();
		System.out.println("second constructor");
	}
	void method() {
		super.method();
		System.out.println("ex");
	}
	void method2(){
		System.out.println("second");
	}
}
class exx extends exx1{
	public static void main(String[] args) {
		// exx1 obj=new exx();
		exx1 obj1 = new ex();
		obj1.method();
		obj1.method2();
	}
}