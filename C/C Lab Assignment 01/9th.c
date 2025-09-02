//WAP to reverse number//
#include<stdio.h>
int main()
{
	int n,reverse,r;
	printf("Enter a Number:-");
	scanf("%d",&n);
	//reverse the number//
	while(n>0)
	{
		r=n%10;
		n=n/10;
		reverse=r+reverse*10;
	}
	printf("\n Reverse Number is %d",reverse);
	return 0;
}
