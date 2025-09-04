//Q12:students information  using class 
#include<iostream>
#include<string>
using namespace std;
class Students{
             public:
             string Name;
             int Roll_No ;
             char Grade;
             
             void Insert(string n,int r,char g)
             
             {
                          Name=n;
                          Roll_No=r;
                          Grade=g;
                          
                          cout<<Name<<endl;
                          cout<<Roll_No<<endl;
                          cout<<Grade<<endl<<endl;
             }
};
int main()
{
   Students s1,s2,s3;
   s1.Insert("Pankaj" , 101,'A'); 
   s2.Insert("Rajneesh" ,102 ,'B'); 
   s3.Insert("Rahul" , 103,'C');         
}
