
import java.math.BigDecimal;
import java.util.*;
class Solution{
   
   
   public static void main(String []argh)
   {
       //Input
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       Number[] s = new Number[n+2];
       for(int i=0;i<n;i++)
       {
           s[i] = new Number();
           s[i].realNumber = sc.next();
           s[i].convNumber = new BigDecimal(s[i].realNumber);
       }
       Comparator<Number> desc = new Comparator<Number>() {
           public int compare(Number a, Number b) {
               if (a != null && b != null)
                   return b.convNumber.compareTo(a.convNumber);
               return 0;
           }  
       };
       Arrays.sort(s,desc);
       for(int i=0;i<n;i++)
       {
           System.out.println(s[i].realNumber);
       }

   }


}

class Number {
   String realNumber;
   BigDecimal convNumber;
}