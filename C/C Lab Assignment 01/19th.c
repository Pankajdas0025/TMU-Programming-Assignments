//WAP to sum of fd & ld//
#include<stdio.h>
int main()
{
	int n,fd=0,ld,sum=0 ;
	printf("Enter a Number=");
	scanf("%d",&n);
	//calculat fd &Ld//
	ld=n%10;
	while(n>=10)
	{
		n=n/10;
		fd=n;
	}
	sum=ld+fd;
		
		fd=n;
	printf("Sum of ld&fd=%d",sum);
	return 0;
}
