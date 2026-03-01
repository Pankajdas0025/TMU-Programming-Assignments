//10. WCP to find the largest number among three numbers......................................
    using System;
    namespace a10;
    class Program
    {
        static void Main()
        {
            Console.WriteLine("Enter three numbers:");
            int num1 = Convert.ToInt32(Console.ReadLine());
            int num2 = Convert.ToInt32(Console.ReadLine());
            int num3 = Convert.ToInt32(Console.ReadLine());

            int largest = FindLargest(num1, num2, num3);
            Console.WriteLine("The largest number is: " + largest);
        }
        static int FindLargest(int a, int b, int c)
        {
            if (a >= b && a >= c)
                return a;
            else if (b >= a && b >= c)
                return b;
            else
                return c;
        }
    }