//Q7;sum of two  square matrix

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
       //sum of matrices
       cout<<"sum of both matrix is :"<<endl;
     
       int sum[s][s];
         for(int p=0;p<s;p++)
         
       {  
        
        for(int q=0;q<s;q++)
      
              
                    {
                                 sum[p][q]=MAT1[p][q]+MAT2[p][q];
                                 cout<<sum[p][q]<<" ";
                     
                    }  
                    cout<<endl;          
       }
      
}
