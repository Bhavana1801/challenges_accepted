class array {
    public static void main(String args[]) 
    {    
        char array_variable [] = new char[10];
        int a[][] = new int[3][];
        char s='i';
	    for (int i = 0; i < 10; ++i) {
            array_variable[i] = s;
            System.out.print(array_variable[i] + "" );
            i++;
	        s++;
        }
    } 
}
