//WAP to conert days into yr,week,day//
#include<stdio.h>
int main()
{
	int year,week,day,days;
	printf("Enter Number of days=");
	scanf("%d",&days);
	//convert//
	year=days/365;
	week=(days%365)/7;
	day=(days%365)%7;
	//displays result//
	printf("Year=%d\n Week=%d\n Remaining days=%d",year,week,day);
	return 0;
	
}
