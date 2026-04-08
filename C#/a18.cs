/*18 .  Write a C# program to input a number and check whether it is a NEON number or not.  Note- A number is said to be Neon, if sum of all the digits of the square of the number is equal to the number itself. For example: 9 is a Neon Number. Square of 9=81 Sum of Digits of square=8 + 1=9*/

using System;
namespace a18;
class Program{
    static void Main(){
        Console.WriteLine("Enter a number:");
        int number=Convert.ToInt32(Console.ReadLine());
        if(IsNeonNumber(number)) Console.WriteLine(number+" is a NEON Number.");
        else Console.WriteLine(number+" is not a NEON Number.");
    }
    static bool IsNeonNumber(int num){
        int square=num*num;
        int sumOfDigits=SumOfDigits(square);
        return sumOfDigits==num;
    }
    static int SumOfDigits(int num){
        int sum=0;
        while(num>0){sum+=num%10;num/=10;}
        return sum;
}}