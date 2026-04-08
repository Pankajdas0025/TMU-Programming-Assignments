/* A smith number is a composite number, the sum of whose digits is the sum of the digits of its prime factors obtained as a result of prime factorization (excluding 1). The first few such numbers are 4, 22, 27, 58, 85, 94, 121.....
Example 1. 666 Prime factors are 2, 3, 3 and 37 Sum of the digits are (6+6+6) = 18 Sum of the digits of the factors 2+3+3+(3+7) = 18 Sample data: Input 94 Output SMITH Number Input 102 Output NOT SMITH Number
*/
using System;
namespace a17;
class Program{
static void Main(){
Console.WriteLine("Enter a number:");
int number=Convert.ToInt32(Console.ReadLine());
if(IsSmithNumber(number)) Console.WriteLine(number+" is a SMITH Number.");
else Console.WriteLine(number+" is NOT a SMITH Number.");
}
static bool IsSmithNumber(int num){
if(num<2) return false;
int sumOfDigits=SumOfDigits(num);
int sumOfPrimeFactorsDigits=SumOfPrimeFactorsDigits(num);
return sumOfDigits==sumOfPrimeFactorsDigits;
}
static int SumOfDigits(int num){
int sum=0;
while(num>0){sum+=num%10;num/=10;}
return sum;
}
static int SumOfPrimeFactorsDigits(int num){
int sum=0;
for(int i=2;i<=num;i++)
while(num%i==0){sum+=SumOfDigits(i);num/=i;}
return sum;
}}