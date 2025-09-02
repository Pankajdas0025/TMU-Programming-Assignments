//WAP sum of digits
#include<stdio.h>
int main()
{
	int n,sum=0,r;
	printf("Enter a Number=\t");
	scanf("%d",&n);
	//sum//
	while(n>0)
	{
		r=n%10;
		sum=sum+r;
			n=n/10;
	}
	printf("Sum of Digits=%d\t",sum);
	return 0;
}
