class string1 {
        public static void main(String args[])
        {
            String obj = "hello";
            String obj1 = "hello";   
            obj1 = obj;
            // obj1 = " worlds";
            obj = obj + ".";
            System.out.println(obj + " " + obj1);
        }
    }