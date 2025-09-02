//simple interest pro.//
#include<stdio.h>
int main()
{
	int si,r,t,p;
	printf("Enter Principal value:-\n Enter the rate of interest :-\n enter time period:-\n");
	scanf("%d%d%d", &p,&r,&t);
	//Interet formula //
	si=(p*r*t)/100;
	printf("Simple interest=%d Rs.", si);
	return 0;
	
}
