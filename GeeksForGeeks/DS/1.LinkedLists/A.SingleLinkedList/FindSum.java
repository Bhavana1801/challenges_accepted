// Given a sorted array of size n having numbers in range from 1 to n count how many numbers are sum of some other two elements in the same array in (n) time and O(1) space
class FindSum {
    public static void main(String[] args) {
        Integer a[] = {1,100,101,104,105};
        int count=0;
        for(int i = 0; i< a.length; i++) {
            int start =0,end=a.length-1;
            int sum=a[i];
            boolean flag=false;
            System.out.println("sum "+sum);
            while(start<end){
                // System.out.println("a= "+a[start]+" b= "+a[end]);
                if(sum < a[start]+a[end]) {
                    end--;
                }
                else if(sum > a[start]+a[end]) {
                    start++;
                }
                else if(a[start]+a[end]==sum) {
                    System.out.println("a= "+a[start]+" b= "+a[end]);
                    end--;
                    start++;
                    count++;
                     break;
                }
            }
        }
        System.out.println("count"+count);
    }
}
