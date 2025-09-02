#include<stdio.h>
int main()
{int num;
printf("Enter a Number=");
scanf("%d",&num);
square(num);//function calling//
cube(num);//function calling//

return 0;	
}
int square(int a)
{
	int sq=a*a;
	printf("Square is %d\n",sq);//function difinition//
}
int cube(int a)
{
	int cu=a*a*a;
	printf("Cube is %d",cu);//function difinition//
}


