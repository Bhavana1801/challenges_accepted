// #include <stdio.h>
// int main()
// {
// int i = 10;
// int *a = &i;
// printf("%d", *a);
// return 0;
// }
#include <stdio.h>
int main()
{
int *a;
int i = 10;
*a = &i;
printf("%d", *a);
return 0;
}