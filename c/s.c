#include<stdio.h>
int x = 0;
 
int f1()
{
  x = 5;
  printf("came to f1\n");
  return x;
}
 
int f2()
{
	printf("came to f2\n");
  x = 10;
  return x;
}
 
int main()
{
  int p = f1() + f2();
  printf("%d ", x);
  getchar();
  return 0;
}