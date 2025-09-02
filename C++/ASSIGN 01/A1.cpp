//Q1:calculate sum and average of five numbers
#include<iostream>
using namespace std;
int main()
{
	int a,b,c,d,e;
	cout<<"Enter first number : ";cin>>a;
	cout<<"Enter second number : ";cin>>b;
	cout<<"Enter third number : ";cin>>c;
	cout<<"Enter fourth number : ";cin>>d;
	cout<<"Enter fifth number : ";cin>>e;
	int sum=a+b+c+d+e;
	float avg=sum/5;
	cout<<"Sum of all numbers is : "<<sum<<endl;
	cout<<"Average  of all numbers is : "<<avg;
	
}
