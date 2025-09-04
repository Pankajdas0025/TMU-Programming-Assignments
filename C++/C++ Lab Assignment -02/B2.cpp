//Q12: maximum element in array
#include<iostream>
using namespace std;
int main()
{int n;
cout<<"Enter size of varray A:";
cin>>n;
int A[n];
cout<<"Enter array Element: ";
//inputs
for(int i=0;i<n;i++){
             cin>>A[i];
}
//array
for(int i=0;i<n;i++){
             cout<<A[i]<<endl;
}
//max element 
int max=A[0];
for(int i=0;i<n;i++)
{
             if(A[i]>=max)
             {
                         max=A[i];
                     
             }
}
cout<<"Maximum element in array is "<<max;
return 0;

}

