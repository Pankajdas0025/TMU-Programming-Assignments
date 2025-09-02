#include<stdio.h>
int main()
{ int a=0;
	int b=1,c,i;
	printf("Fibonacci series upto 100\n");
	for(i=0;i<=100;i++)
	{if(a>=100)
		break;
		printf("%d\t",a);
		
		c=a+b;
		a=b;
		b=c;
	}
return 0;	
}
