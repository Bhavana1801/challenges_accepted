class static_out {
        static int x;
 	static int y;
    final int a1=10;
    static_out() {
        // a1 = 20;
    }

        void add(int a, int b){
            x = a + b;
            System.out.println("x= "+x);
            y = x + b;
            
             System.out.println("a = "+a1);
        }
    }    
    class static1 {
        public static void main(String args[])
        {
            static_out obj1 = new static_out();
            static_out obj2 = new static_out();   
            int a = 2;
            obj1.add(a, a + 1);
            obj2.add(5, a);
            System.out.println(obj2.x + " " + obj1.y);     
        }
   }