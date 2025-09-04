//Q11.copy constructor
#include<iostream>
using namespace std;
class Num{
             public:
                          int a;
                          Num(int n){
                                       a=n;
                          }
                          Num(Num&i){
                                       a=i.a;
                          }
};
int main(){
             Num n1(200);
             Num n2(n1);
             cout<<n2.a;
             return 0;
             
             
}
