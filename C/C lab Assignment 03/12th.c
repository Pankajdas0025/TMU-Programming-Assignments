#include<stdio.h>
int main()
{
	int arr[10]={10,20,30,40,50,60,70,80,90,100};
	int a,p,i;
	printf("Enter The array Element for searching:-");
	scanf("%d",&a);
	//search//
	for(i=0;i<10;i++)
	{
		if(arr[i]==a)
		
		{printf("Searching Completed !\n");
		p=i;
		}
	}
	printf("Element %d found in possition %d",a,p);
	return 0;
	
}
