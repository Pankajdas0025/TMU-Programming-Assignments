//Q11: sum and averge using arry
#include<iostream>
using namespace std;
int main(){
             
int A[5];
//input
cout<<"Enter 5 numbers: ";
for(int i=0;i<5;i++){
             cin>>A[i];
}
//numbers
cout<<"5 numbers are : ";
for(int i=0;i<5;i++){
             cout<<A[i]<<"\t";
}
//sum
int sum=0;
for(int i=0;i<5;i++){
             sum=sum+A[i];
                    
}
cout<<endl<<"Sum of number: "<<sum<<endl;
cout<<"Average of number: "<<sum/5<<endl;
return 0;
}

