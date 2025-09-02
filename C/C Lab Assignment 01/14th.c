/*WAP to find greater number between two number without 
using conditional statement*/
#include<stdio.h>
int main()
{
	int a,b,max;
	printf("Enter two value\n");
	scanf("%d%d",&a,&b);
max=a>b?a:b;
printf("%d is greater number",max);
return 0;	
}
