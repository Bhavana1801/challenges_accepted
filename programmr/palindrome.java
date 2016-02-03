import java.io.*;  
  
class palindrome  
{  
	public static void main(String a[]) throws Exception  
	{  
           String strn;  
           int flag=0;  
           System.out.println("Enter the string:");  
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
           strn=br.readLine();  
           System.out.println("Result string is:");  
           String str2="";
           //write your logic here  
            for(int i = (strn.length())-1; i >=0;i--) {
                str2 = str2+strn.charAt(i)+"";
                System.out.println(str2);
            }
            
            System.out.println(str2);
            if(strn.equals(str2)) {
                flag = 1;
            }
  
  
  
  
           //end  
           if(flag==1)  
               System.out.print("palindrome");  
           else   
               System.out.print("not a palindrome2");  
  
        }  
}  
