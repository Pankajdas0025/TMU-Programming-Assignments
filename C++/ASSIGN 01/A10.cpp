//Q10: implement and show constructor destructor
#include<iostream>
using namespace std;

class Employee{
             public:// access specifier

            Employee()  //contructor
             {
                cout<<"This is a constructor!"<<endl;      
             }
             ~Employee()  // destructor
             {
                cout<<"Destructor invoked !";      
             }
             }; 
int main()
{
             
 Employee e1;

 return 0; 
         
}
