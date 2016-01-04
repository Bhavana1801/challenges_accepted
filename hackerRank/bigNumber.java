import java.util.Scanner;
import java.math.BigInteger;
class bigNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a num");
        int num=in.nextInt();

        for(int x =1; x<=num; x++) {
            System.out.println("loop enter");
            Scanner in1=new Scanner(System.in);
            BigInteger number = new BigInteger(in1.nextLine());
            //number=in.nextLine();
            int bitLength = number.bitLength();
            
            if (bitLength <= Short.SIZE) {
                System.out.println(number+" can be fitted in:");
                 System.out.println("* short");
                 if (bitLength <= Integer.SIZE)
                System.out.println("* int");
                if (bitLength <= Long.SIZE)
               System.out.println("* long");
            }
            else if (bitLength <= Integer.SIZE) {
                System.out.println(number+" can be fitted in:");
                System.out.println("* int");
                if (bitLength <= Long.SIZE)
               System.out.println("* long");
            }
            else if (bitLength <= Long.SIZE){
                System.out.println(number+" can be fitted in:");
                System.out.println("* long");
            }
             

         
            if (bitLength > Long.SIZE)
                System.out.println(number + " can't be fitted anywhere.");
           

        }
    }
}