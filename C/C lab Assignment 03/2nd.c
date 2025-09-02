//factorial og a number using function//\]
#include<stdio.h>

int main()
{ int num;
printf("Enter number Whose factorial You want=");
scanf("%d",&num);
factorial(num);
return 0;
	
}
int factorial(int a)
{
	int i,fact=1;
	for(i=1;i<=a;i++)
{
	fact=fact*i;
}printf("Factorial is %d",fact);
}
