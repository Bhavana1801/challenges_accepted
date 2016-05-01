class Employee {
// public void getAddress(){
final int location = 13; 
int notFinalVar = 13;   
    class Address {
    	static void print() {
    		System.out.println (location);
    	}
        
       // System.out.println (notFinalVar); // compiler error
    }
}