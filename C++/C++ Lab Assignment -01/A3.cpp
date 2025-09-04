//Q3:check number is prime or not 
#include<iostream>
using namespace std;
int Prime(int num)
{

for(int i=2;i<num-1;i++){
	if(num%i==0){
		cout<<"It's NOT prime number !";
		return 0;
	}

}
	cout<<"It's a Prime number !";
}
int main()
{
int num;
cout<<"Enter a Number :";
cin>>num;
Prime(num);
}
