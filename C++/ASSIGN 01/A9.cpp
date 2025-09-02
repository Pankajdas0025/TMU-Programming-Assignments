//Q8:enumaration program
#include<iostream>
using namespace std;

class Note{
             public:// access specifier
             int classfun(){
             cout<<"Hello World ! using C++ class method";
          }
          }; 
int main()
{
 Note mynote;//class object  
 mynote.classfun(); 
 return 0;         
}
