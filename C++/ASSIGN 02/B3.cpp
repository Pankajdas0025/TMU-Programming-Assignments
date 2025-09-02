//Q13:insert element into a array

#include<iostream>
using namespace std;
int main()
{
         int arr[] = {20, 30, 40};
        cout<<"Array element before inserting :";
        int length=sizeof(arr)/sizeof(arr[0]);
        for(int i=0;i<length;i++){
                     cout<<arr[i]<<"\t";
        }
        //insert into start 
      
          for(int i=length;i>0;i--){
                   arr[i]=arr[i-1];
                           }
        //
        cout<<"\n /Enter an element at the beggining:";cin>>arr[0];
        length++;
        
        
          cout<<"Array element after inserting :";
        for(int i=0;i<length;i++){
                     cout<<arr[i]<<"\t";
        }
        
        return 0;
        
}
