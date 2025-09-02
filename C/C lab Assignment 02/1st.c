//WAp decimal to Binary
# include<stdio.h>
int main()
{
	int num,base=1,r,Bin=0 ;
	printf("Enter a Decimal Number=");
	scanf("%d",&num);
	//convert
	while(num>0)
	{
		r=num%2;
		Bin=Bin+(r*base);
		base=base*10;
		num=num/2;
	}
	//output
	printf("Equivalent Binary Number=%d",Bin);
	return 0;
}
