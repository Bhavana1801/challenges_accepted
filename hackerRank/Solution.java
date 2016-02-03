import java.util.Scanner;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int spaces;
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                spaces= s1.length()-15;
          		System.out.format(s1+"%"+spaces+"s");
          		System.out.printf("%09d",x);
            }

            System.out.println("================================");

    }
}
