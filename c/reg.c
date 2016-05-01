#include "stdio.h"
int main(){
	register int i=5;
      char j[]= "hello";
      printf("%s %d %p", j, i,&i);
}