// 
#include <stdio.h>
	 
inc()
{
        static int x;
        printf("ab","bc","cd");
	printf("%d", ++x);
}
int main()
{
        int a = 5, b = 2;
printf("%d",a+++++b);