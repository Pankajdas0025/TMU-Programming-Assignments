//Q2:factorial of posssitive number 
#include<iostream>
using namespace std;
int main()
{
	int num,fact=1;
	cout<<"Enter a Possitive number which factorial you want :";
	cin>>num;
	for(int i=num;i>0;num--){
		
		fact=fact*num;
	}
	cout<<"The factorial is "<<fact;
	return 0;
}
