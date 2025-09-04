//Q5:swap two number
#include<iostream>
using namespace std;
	int Vswap(int x,int y)//swaping by call by value
	{
		int t;
		t=x;
		x=y;
		y=t;    
	cout<<"After swap (call by value) ............"<<endl;
	cout<<"a="<<x<<endl<<"b="<<y<<endl;              
	}
		int Rswap(int &x,int &y)//swaping by call by reference
	{
		int t;
		t=x;
		x=y;
		y=t;    
	cout<<"After swap (call by reference) ............"<<endl;
	cout<<"a="<<x<<endl<<"b="<<y<<endl;              
	}
	
		int Aswap(int *x,int *y)//swaping by call by address
	{
		int t;
		t=*x;
		*x=*y;
		*y=t;    
	cout<<"After swap (call by address) ............"<<endl;
	cout<<"a="<<*x<<endl<<"b="<<*y;              
	}
	
int main(){
	int a=50,b=80;
	cout<<"Before swap"<<endl;
	cout<<"a="<<a<<endl<<"b="<<b<<endl;
	Vswap(a,b);//swaping by call by value
	Rswap(a,b);//swaping by reference 
	Aswap(&a,&b);//swaping by address
	
}
