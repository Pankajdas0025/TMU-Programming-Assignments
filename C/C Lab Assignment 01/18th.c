//WAP to find sum of natural number from 1-50
#include<stdio.h>
int main()
{
	int n=1,sum=0;
	printf("\nNatural Numbers from 1-50\n");
	//displays//
	while(n<=50)
	{
		printf("%d\t",n);
		sum=sum+n;
		n++;
	}
	printf("\n\nSum of numbers from 1-50=%d",sum);
	return 0;
}
