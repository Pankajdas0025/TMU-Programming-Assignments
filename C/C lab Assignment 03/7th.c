#include<stdio.h>
int main()
{
	char str[]="TEERTHANKER";
	int l=sizeof(str)/sizeof(str[0]);
	int c=0,v=0,i=0;
	char *p=&str[i];
	printf("String=%s\n",str);
	
	for(i=0;i<l;i++)
	{
	if(str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U')
	
	v++;
	else if(str[i]>'A'||str[i]>'Z')
	c++;}
puts(v);
	printf("\nTotal Consonant in given string=%d",c);
	return 0;
}
