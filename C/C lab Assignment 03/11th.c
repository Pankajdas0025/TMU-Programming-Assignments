#include<stdio.h>
int main()
{
	char str[100];
	printf("Enter Your statement:");
	gets(str);
	int l=sizeof(str)/sizeof(str[0])
	int i=0,v=0,c=0,w=0,s=0;
	//count vowels &consonant//
	for(i=0;i<100;i++)
	{
		if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u')
v++;
	else if(str[i]>'a'||str[i]>'z')
	c++;
		else if(str[i]==' ')
	s++;
	w=s+1;
	
	
	}
	printf("Total vowels in given statement=%d",v);
	printf("\nTotal Consonant in statement=%d",c);
	printf("\nTotal words in statemengt=%d",w);
	printf("\nTotal space in statemengt=%d",s);
	printf("\nTotal space in statemengt=%d",l);
	return 0;
}
