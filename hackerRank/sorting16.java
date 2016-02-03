import java.util.*;
class sorting16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		String res="";
		int nums[] = new int[max];
		for(int i = 0; i < max; i++) {
			nums[i] = sc.nextInt();
		}
		for (int i = 0; i < max; i++)
        {
            int index = i;
            for (int j = i + 1; j < max; j++)
                if (nums[j] < nums[index])
                    index = j;
      
            int smallerNumber = nums[index]; 
            nums[index] = nums[i];
            nums[i] = smallerNumber;
        }
        int soln=0;
        int num1=0,num2=0;
        int count =0;
        for(int i =0; i<max;i++) {
            int temp;
            for(int j=i+1;j<max;j++) {
            	temp=Math.abs(nums[i]-nums[j]);
            	if(count ==0) {
            		soln=temp;
            		// System.out.println("soln"+soln);
            		num1=nums[i];
                    num2=nums[j];
            		count++;
            	}
                else if(temp<soln) {
                    soln = temp;
                    num1=nums[i];
                    num2=nums[j];
                }
            }
        }
        System.out.println(num1+" "+num2);

	}
}