 //check number is pallindrome
 #include<stdio.h>
 int main()
 {
 	int num,Inum,reverse=0,r;
 	printf("Enter a Number");
 	scanf("%d",&num);
 	Inum=num;
 	//find reverse num
 	while(num>0)
 	{
 		r=num%10;
 		reverse=r+reverse*10;
 		num=num/10;
	 }
	 if(reverse==Inum)
	 printf("Palindrome Number");
	 else printf("Not Palindrome Number");
 }
