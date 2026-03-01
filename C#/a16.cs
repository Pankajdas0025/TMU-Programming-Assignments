//16. Write a Program in C# to input a number and check whether it is an Automorphic Number or not. Note: An automorphic number is a number which is present in the last digit(s) of its square. Example: 25 is an automorphic number as its square is 625 and 25 is present as the last digits.
using System;
namespace a16;

class Program
{
    static void Main()
    {
        Console.WriteLine("Enter a number:");
        int number = Convert.ToInt32(Console.ReadLine());

        if (IsAutomorphic(number))
        {
            Console.WriteLine(number + " is an Automorphic Number.");
        }
        else
        {
            Console.WriteLine(number + " is not an Automorphic Number.");
        }
    }

    static bool IsAutomorphic(int num)
    {
        int square = num * num;
        string numStr = num.ToString();
        string squareStr = square.ToString();

        return squareStr.EndsWith(numStr);
    }
}