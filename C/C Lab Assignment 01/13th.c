#include<stdio.h>
int main()
{
	int a,b,c;
	printf("Enter Three Number\n");
	scanf("%d%d%d",&a,&b,&c);
	//greaterr number find//
	if(a>b&&a>c)
	printf("\n %d is greater Number",a);
	else if(b>a&&b>c)
	printf("\n%d is greater Number",b);
	else 
	printf("\n %d is greater Number",c);
	
	return 0;
	
}
