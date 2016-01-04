import java.io.*;
import java.util.*;

public class YesOrNo {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if(A.compareTo(B) >=1) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        A = ((A.charAt(0)+"").toUpperCase())+A.substring(1,A.length());
        B = ((B.charAt(0)+"").toUpperCase())+B.substring(1,B.length());
        System.out.println(A+" "+B);
        
    }
}
