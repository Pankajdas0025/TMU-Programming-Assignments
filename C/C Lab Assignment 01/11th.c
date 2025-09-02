//WAp for leap year//
#include<stdio.h>
int main()
{
int year;
printf("Enter any Year:-");
scanf("%d",&year);
//check leap year//
if(year%4==0)
printf("\n %d is Leap Year",year);  
else printf("%d is Not leap Year",year);
return 0;               
}
