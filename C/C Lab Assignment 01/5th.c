#include<stdio.h>
int main()
{
	float v,r,h,pi;
	printf("Enter radius if cylinder:-");
	scanf("%f", &r);
	printf("Enter height of cyllinder:-");
	scanf("%f", &h);
	// Volume//
	pi=3.14;
	v=pi*r*r*h;
	printf("Volume of cylinder=%.2f\n",v);
	return 0;
}
