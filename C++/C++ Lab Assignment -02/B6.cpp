//Q6;transpose of a matrix 

#include<iostream>
using namespace std;
int main()
{
       int m,n;
       cout<<"Enter matrix row : ";
       cin>>m;
       cout<<"Enter matrix column : ";
       cin>>n;
       int MAT[m][n];
       cout<<"Enter "+ m*n+" matrix element : ";
       for(int i=0;i<m;i++)
       {
        for(int j=0;j<n;j++)
                    
                    {
                                 cin>>MAT[i][j];
                     
                    }            
       }
       
       
       cout<<"Matrix is :"<<endl;
         for(int i=0;i<m;i++)
       {
        for(int j=0;j<n;j++)
                    
                    {
                                 cout<<MAT[i][j]<<" ";
                     
                    }  
                    cout<<endl;          
       }
       //transpose of the matrix means that SMAT[n][m];
        cout<<"Transpose of Matrix is :"<<endl;
         for(int i=0;i<n;i++)
       {
        for(int j=0;j<m;j++)
                    
                    {
                                 cout<<MAT[j][i]<<" ";
                     
                    }  
                    cout<<endl;          
       }
}
