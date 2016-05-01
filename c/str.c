#include "stdio.h"
void display(char *string)
{
      printf("%s", string);
}
int main()
{
      char string[]="Hello World";
      display(string);
      return 1;
}
