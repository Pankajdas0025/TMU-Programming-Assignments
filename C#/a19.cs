//Write a C# program for Emrip number. Example: 13 is Emrip number since 13 and 31 are both prime number, means that forward and backward of a number will be prime number.
using System;
namespace a19;
class Program
{
    static void Main()
    {
        Console.WriteLine("Enter a number:");
        int number = Convert.ToInt32(Console.ReadLine());

        if (IsEmirp(number))
        {
            Console.WriteLine(number + " is an Emirp Number.");
        }
        else
        {
            Console.WriteLine(number + " is not an Emirp Number.");
        }
    }

    static bool IsEmirp(int num)
    {
        if (IsPrime(num))
        {
            int reversedNum = ReverseNumber(num);
            return num != reversedNum && IsPrime(reversedNum);
        }
        return false;
    }

    static bool IsPrime(int num)
    {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.Sqrt(num); i++)
        {
            if (num % i == 0) return false;
        }
        return true;
    }

    static int ReverseNumber(int num)
    {
        int reversed = 0;
        while (num > 0)
        {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
}