#include<stdio.h>
int main()
{int a=10,b=20;
printf("Before swapping a=%d\n",a);
printf("Before swapping b=%d\n",b);
swap(a,b);
return 0;	
}
int swap(int a,int b)
{
	a=a+b;
	b=a-b;
	a=a-b;
printf("\nAfter swapping a=%d\n",a);
printf("After swapping b=%d",b);
}
