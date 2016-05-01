#include <stdio.h>
 void foo(int **const p)
      {
          int j = 11;
          *p = &j;
          printf("%d ", **p);
      }
      int main()
      {
          // int i = 10;
          // int const *p = &i;
          int i=5;
          printf("%d\n", i);
printf("%d%d%d%d%d",i,i--,++i,--i,i);
      }
     