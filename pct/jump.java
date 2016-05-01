class jump {
        public static void main(String args[]) 
        {        
             int x = 2;
             int y = 0;
             for ( ; y < 10; ++y) {
                for(;x<10;x++) {
                    if (y % x == 0)  {
                        System.out.println("if");
                        continue; 
                    }
                      
                    else if (y == 3) {
                     System.out.println("else if");
                     break;
                    }
                      
                    else {
                        System.out.println(y + " ");
                    } 
                     System.out.println("first for loop");
                }
                 System.out.println("second for loop");
                    
             }
        } 
    }