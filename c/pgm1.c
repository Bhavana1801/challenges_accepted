#include <stdio.h>
void fun(void){

}
int main() {
	int i = 1;
	printf("%d %d %d\n",i++,i++,i );
	fun();
	return 0;
}