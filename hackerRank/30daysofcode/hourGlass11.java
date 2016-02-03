import java.util.*;
class hourGlass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums[][] = new int[6][6];
		int i=0,j;
		while(i<6) {
			j=0;
			String str = sc.nextLine();
			StringTokenizer st = new StringTokenizer(str," ");
			while(st.hasMoreTokens()) {
				nums[i][j]=Integer.parseInt(st.nextToken());
				j++;
			}
			i++;

		}
		int sum=0;
		int max=0;
		for(i=0; i <6;i++) {
			for(j=0; j<6;j++) {
				if(j+2<6 &&j+1<6&&i+1<6&&i+2<6) {
					sum=nums[i][j]+nums[i][j+1]+nums[i][j+2]+nums[i+1][j+1]+nums[i+2][j]+nums[i+2][j+1]+nums[i+2][j+2];
					// System.out.println(nums[i][j]+" "+nums[i][j+1]+" "+nums[i][j+2]);
					// System.out.println("  "+nums[i+1][j+1]);
					// System.out.println(nums[i+2][j]+" "+nums[i+2][j+1]+" "+nums[i+2][j+2]);
					// System.out.println();
				}
				
				if(sum>=max) {
					max=sum;
				}
			}
		}
		System.out.println(max);
		
	}
}