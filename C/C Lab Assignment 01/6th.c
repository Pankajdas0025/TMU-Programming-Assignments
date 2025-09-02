#include<stdio.h>
int main()
{
	int n,sum;
	printf("Enter a Five digits Number:-");
	scanf("%d", &n);
	//sum//
	sum+=n/10000;
	sum+=(n/1000)%10;
	sum+=(n/100)%10;
	sum+=(n/10)%10;
	sum+=n%10;
	printf("\n Sum of digits =%d\n",sum);
	return 0;
	
}
