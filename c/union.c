#include "stdio.h"
int main(){
union foo {
  int a;   // can't use both a and b at once
  char b;
} foo;
union foo x;

x.b='A';
x.a=3;
printf("%d %d",x.a,x.b);
	return 1;
}