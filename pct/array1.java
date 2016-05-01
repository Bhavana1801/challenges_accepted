class array1 {
        public static void main(String args[]) 
        {
       	    int array_variable [] = new int[10];
	    for (int i = 0; i < 10; ++i) {
            System.out.println("i/2 value: "+(i/2));
                array_variable[i] = i/2;
                // System.out.println("first: "+array_variable[i]);
                array_variable[i]++;
                // System.out.println("second: "+array_variable[i]);
                //System.out.print(array_variable[i] + " ");
                i++;
                System.out.println("i value: "+i);
            }
 
        } 
    }