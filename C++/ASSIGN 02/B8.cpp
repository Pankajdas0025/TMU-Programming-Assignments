//Q8 product of two  square matrix

#include<iostream>
using namespace std;
int main()
{
       int s;
       cout<<"Enter the size  of Square matrices: ";
       cin>>s;
       int MAT1[s][s], MAT2[s][s];
       //first
       cout<<"Enter "<<s*s<<" element of first matrix : ";
       for(int i=0;i<s;i++)
       {
        for(int j=0;j<s;j++)
                    
                    {
                                 cin>>MAT1[i][j];
                     
                    }            
       }
       
       
       cout<<"Matrix first is :"<<endl;
         for(int i=0;i<s;i++)
       {
        for(int j=0;j<s;j++)
                    
                    {
                                 cout<<MAT1[i][j]<<" ";
                     
                    }  
                    cout<<endl;          
       }
       //second
         cout<<"Enter "<<s*s<<" element of second matrix : ";
       for(int i=0;i<s;i++)
       {
        for(int j=0;j<s;j++)
                    
                    {
                                 cin>>MAT2[i][j];
                     
                    }            
       }
       
       
       cout<<"Matrix second is :"<<endl;
         for(int i=0;i<s;i++)
       {
        for(int j=0;j<s;j++)
                    
                    {
                                 cout<<MAT2[i][j]<<" ";
                     
                    }  
                    cout<<endl;          
       }
       //product of matrix'
       int Mul[s][s];
         for(int i=0;i<s;i++)
       {
        for(int j=0;j<s;j++)
       {

       Mul[i][j]=0;
       for(int k=0;k<s;k++)
       {
                    Mul[i][j]+=MAT1[i][k]*MAT2[k][j];
       }
       }
        
                    
                
       }
       //print product
         cout<<"Product of Matrix is :"<<endl;
        for(int i=0;i<s;i++)
       {
        for(int j=0;j<s;j++)
                    
                    {
                                 cout<<Mul[i][j]<<" ";
                     
                    }  
                    cout<<endl;          
       }
       
      return 0;
      
}
