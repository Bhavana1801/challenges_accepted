import java.lang.reflect.*;
    class Add {	 
         public static void main(String args[]) {
	     try {
	         Class c = Class.forName("java.awt.Dimension");
		 Constructor constructors[] = c.getConstructors();
		 for (int i = 0; i < constructors.length; i++)
		     System.out.println(constructors[i]);
		 }
	     catch (Exception e){
             System.out.print("Exception");
             }
        }
    }
