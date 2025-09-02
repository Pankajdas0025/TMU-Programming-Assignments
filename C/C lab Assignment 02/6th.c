#include<stdio.h>
int main()
{
	int num,reverse=0,r;
	printf("Enter a integar Number=");
	scanf("%d",&num);
	//reverse the number ...//
	while(num>0)
	{
		r=num%10;
		num=num/10;
		reverse=r+reverse*10;
		
	}
	printf("\n Reverse Number is %d",reverse);}
