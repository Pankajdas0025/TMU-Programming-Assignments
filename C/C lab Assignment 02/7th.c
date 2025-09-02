#include<stdio.h>
int main()
{
	int num,i=1,t;
	printf("Enter a Num whose table You want=");
	scanf("%d",&num);
	printf("\nTable of Entered Number");
	while(i<=10)
	{ t=num*i;
		printf("%d*%d=%d\n",num,i,t);
		i++;
	}return 0;
}
