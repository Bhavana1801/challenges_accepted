class access1{
        public int x;
 	private int y;
        void cal(int a, int b){
            x =  a + 1;
            y =  b;
        }        
    }    
    class access {
        public static void main(String args[])
        {
            access1 obj = new access1();   
            obj.cal(2, 3);
            System.out.println(obj.x + " " + obj.y);     
        }
   }
