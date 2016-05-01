#include "stdio.h"
int main()
{
      int i=1;
      const int j=2;
      switch(i)
      {
            case 1: printf("GOOD"); break;
            case j: printf("BAD"); break;
      }
      return 1;
}