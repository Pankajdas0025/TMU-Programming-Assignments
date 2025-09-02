#include<stdio.h>
int prime(int num)
{int i;
	for(i=2;i<num;i++){
	
if(num%i!=0)
printf("Its Prime Number !");

else if(num%i==0)
printf("Its NOT  Prime Number !");

}
}
int main()
{int num;
	printf("Enter a Number=");
	scanf("%d",&num);
	prime(num);
	return 0;
}
