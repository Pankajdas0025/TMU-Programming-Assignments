//a14. WCP to print the Fibonacci Series using Recursion for N Numbers.

using System;
namespace a14;
class Program
{
    static void Main()
    {
        Console.WriteLine("Enter the number of terms in the Fibonacci series:");
        int n = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("Fibonacci Series:");
        for (int i = 0; i < n; i++)
        {
            Console.Write(Fibonacci(i) + " ");
        }
    }

    static int Fibonacci(int n)
    {
        if (n <= 1)
            return n;
        else
            return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}