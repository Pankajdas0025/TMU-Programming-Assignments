//Q4:delete element from an array

#include<iostream>
using namespace std;
int main()
{
         int arr[] = {10, 20, 30,40,50};
         int l=sizeof(arr)/sizeof(arr[0]);
         cout<<"Before deleting Array elements are :\n";
         
         for(int i=0;i<l;i++){
                      cout<<arr[i]<<"\n";
         }
         cout<<"\nEnter the Possition from where you want to delete Element:";
         int P;
         cin>>P;
         for(int i=P-1;i<l;i++)
         {
                      arr[i]=arr[i+1];
         }
         l--;
           cout<<"\nAfter deleting Array elements are :\n";
         
         for(int i=0;i<l;i++){
                      cout<<arr[i]<<"\n";
         }
         
        return 0; 

}
