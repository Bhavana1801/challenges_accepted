class B
{
     int a=10;
     B(){
       System.out.println("came"); 
     }
     
     public void print()
     {
         System.out.println("inside B super class");
     }

}
 class C extends B
 {
     int a=20;
     // C(){
     //   super(); 
     // }
     
     public void print()
     {

         System.out.println("inside C sub class");
     }
     private int print() {
        System.out.println("secodn"+a);
        return 1;
     }


 }
public class A  {
    public static void main(String[] args) {
        B b=new C();
       // b.print();//it will print inside c sub class
        ((C)b).print();
        System.out.println(((C)b).a);//it will print super class variable value=10
        String str="bhavana";
        char[] ch = str.toCharArray();


    }

}