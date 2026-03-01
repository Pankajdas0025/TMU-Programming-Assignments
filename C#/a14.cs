/* 14 . Write a program to accept the numbers M and N from the user and print the smallest required number whose sum of all its digits is equal to N. Also, print the total number of digits present in the required number. The program should check for the validity of the inputs and display an appropriate message for invalid input.
Given two positive numbers M and N, such that M is between 100 and 10000 and N is less than 100. Find the smallest integer that is greater than M and whose digits add up to N. For example, if M = 100 and N = 11, then the smallest integer greater than 100 whose digits add up to 11 is 119.

Example 1 INPUT: M = 100 N = 11 OUTPUT: The required number = 119 Total number of digits = 3
Example 2 INPUT : M = 1500 N = 25 OUTPUT : The required number = 1699 Total number of digits = 4
*/

using System;
namespace a14;
class Program
{
    static void Main()
    {
        Console.WriteLine("Enter a positive number M (between 100 and 10000):");
        int M = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("Enter a positive number N (less than 100):");
        int N = Convert.ToInt32(Console.ReadLine());

        if (M < 100 || M > 10000 || N < 0 || N >= 100)
        {
            Console.WriteLine("Invalid input. Please enter valid values for M and N.");
            return;
        }

        int requiredNumber = FindRequiredNumber(M, N);
        if (requiredNumber != -1)
        {
            Console.WriteLine("The required number = " + requiredNumber);
            Console.WriteLine("Total number of digits = " + requiredNumber.ToString().Length);
        }
        else
        {
            Console.WriteLine("No such number exists.");
        }
    }

    static int FindRequiredNumber(int M, int N)
    {
        for (int i = M + 1; i <= 99999; i++)
        {
            if (SumOfDigits(i) == N)
            {
                return i;
            }
        }
        return -1; // No such number found
    }

    static int SumOfDigits(int num)
    {
        int sum = 0;
        while (num > 0)
        {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}