//Q5;sum of digonal element of square matrix

#include<iostream>
using namespace std;
int main()
{
       int s;
       cout<<"Enter the size  of Square matrix: ";
       cin>>s;
       int SMAT[s][s];
       cout<<"Enter "<<s*s<<" elements : ";
       for(int i=0;i<s;i++)
       {
        for(int j=0;j<s;j++)
                    
                    {
                                 cin>>SMAT[i][j];
                     
                    }            
       }
       
       
       cout<<"Matrix is :"<<endl;
         for(int i=0;i<s;i++)
       {
        for(int j=0;j<s;j++)
                    
                    {
                                 cout<<SMAT[i][j]<<" ";
                     
                    }  
                    cout<<endl;          
       }
       //sum of digonal elemet means which element where row==column
       int sum=0;
        for(int i=0;i<s;i++)
       {
        for(int j=0;j<s;j++)
                    
                    {
                                 if(i==j)
                                 {
                                              sum=sum+SMAT[i][j];
                                 }
                     
                    }  
      }
       cout<<"Hence ; Sum of digonal elements of Square matrix is :"<<sum;
       return 0;
}
