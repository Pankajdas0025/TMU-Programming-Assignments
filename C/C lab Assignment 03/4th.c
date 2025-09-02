#include<stdio.h>
int main()
{
	int max,length, i,Arr[]={20,30,40,50,10};
	length=sizeof(Arr)/sizeof(Arr[0]);
	//let suppose//
	max=Arr[0];
	for(i=0;i<length;i++)
	{
		if(Arr[i]>=max)
		max=Arr[i];
	}
	printf("Maximam Element=%d",max);
}
