#include<stdio.h>
int main()
{
	int a=10,b=20;
	printf("Value of two Number before swapping");
	printf("\nvalue of a=%d\n Value of b=%d\n ",a,b);
	//swapping//
	a=a+b;
	b=a-b;
	a=a-b;
	printf("\nvalue of two after swapping");
	printf("\nValue of a=%d\n Value of b=%d\n",a,b);
	return 0;
	
}
