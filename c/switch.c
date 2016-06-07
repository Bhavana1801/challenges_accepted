#include "stdio.h"
int main()
{
      int i=1;
      const int j=2;
      const char a='b';
      switch(a)
      {
            case 1: printf("GOOD"); break;
            case j: printf("BAD"); break;
            case a: printf("HELLO");
      }
      return 1;
}