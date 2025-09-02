#include<stdio.h>
int main()
{
	int n,p;
	printf("enter num");
	scanf("%d",&n);
	p=prime_not(n);
	if(p==0)
	printf("it is prime num");
	else 
	printf("it is Not  prime num");
	
}
int prime_not(int n)
{
	int i=2;
	while(i<=n/2)
	{
	if(n%i==0)	
	return 0;
	else 
	i++;
	}return 1;
}
