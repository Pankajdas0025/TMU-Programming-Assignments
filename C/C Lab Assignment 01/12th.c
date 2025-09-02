#include<stdio.h>
int main()
{
	float a,c,r;
	const float pi=3.14;
	printf("Enter radius of circle:-");
	scanf("%f",&r);
	//Circumfrence & Area of circle //
	c=2*pi*r;
	a=pi*r*r;
	//displays result//
	printf("Circumfrence of Circle=%.2f\n Area of circle=%.2f\n ",c,a);
	return 0;
}
