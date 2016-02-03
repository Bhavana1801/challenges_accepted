import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student{
   protected String firstName;
   protected String lastName;
   int phone;
   Student(String fname,String lname,int p){
         firstName=fname;
         lastName=lname;
         phone=p;
       
   }
   public void display(){// display the details of the student
       System.out.println("First Name: "+firstName+"\nLast Name: "+lastName+"\nPhone: "+phone); 
   }

}
class Grade12 extends Student{
   private int score;
   Grade12(String fname,String lname,int phno) {
      super(fname,lname,phno);
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String fname = sc.nextLine();
      String lname = sc.nextLine();
      int phno = sc.nextInt();
      int marks = sc.nextInt();
      Grade12 obj = new Grade12(fname,lname,phno);
      obj.display();
      if(marks<40) {
         System.out.println("Grade: D");
      }
      else if(marks>=40 && marks<60) {
         System.out.println("Grade: B");
      }
      else if(marks>=60 &&marks<75) {
         System.out.println("Grade: A");
      }
      else if(marks>=75 &&marks<90) {
         System.out.println("Grade: E");
      }
      else if(marks>=90 && marks<=100) {
         System.out.println("Grade: O");
      }
   }
}