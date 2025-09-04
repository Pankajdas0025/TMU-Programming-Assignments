//Q4:heck number is palindrome or not
#include<iostream>
int Palindrome(int num)
{            int reverse=0,r;
             int orignal=num;
while(num!=0)
{
	r=num%10;
	reverse=reverse*10+r;
	num=num/10;
	
}
if(orignal==reverse){
	cout<<"The number is Palindrome";
}
else 	cout<<"The number is NOt palindrome";
}
using namespace std;
int main()
{
int num;
cout<<"Enter a number :";
cin>>num;
Palindrome();
}
