#include <stdio.h>
func(int a) {
	printf("hello\n");
}
func(int a, int b) {
	printf("hai\n");
}
int main() {
	int a=10,b=20;
	func(a);
	func(a,b);
}