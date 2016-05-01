class box {
        int width = 10;
        int height=20;
        int length=30;
        int volume;
        protected void finalize() {
            volume = width*height*length;
            System.out.println("in finalize");
            System.out.println(volume);
        }
        protected void volume() {
            volume = width*height*length;
            System.out.println("in volume");
            System.out.println(volume);
       } 
    }    
    class Output { 
        public static void main(String args[])
        {
            box obj = new box();
            obj.volume();
            obj.finalize();
        } 
    }
