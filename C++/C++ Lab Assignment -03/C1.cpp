// 1.) Write a progfram to find the factorial of  a number using recursion


#include<iostream>
using namespace std ;

long int Factorial(int num)

{
if(num == 0)
{
    return  0 ;
}
else if(num ==1)

{
    return 1;
}
else

return num*Factorial(num-1);
}
int main()

{
    int n;
    cout<<"Enter a Number To Find factorial : ";
    cin>>n;
    long int result = Factorial(n);

    cout<<"Factorial of "<<n<<" is : "<<result;
}