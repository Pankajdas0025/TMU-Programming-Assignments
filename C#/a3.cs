using System;
namespace A3
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter any Year (eg: 2001): ");
            int year = Convert.ToInt32(Console.ReadLine());

            if (year % 4 == 0)
            {
                if (year % 100 == 0)
                {

                    if (year % 400 == 0)
                    {
                        Console.WriteLine("This year is a Leap year!");
                    }
                    else
                    {
                        Console.WriteLine("This year is Not a Leap year!");
                    }
                }
                else
                {
                    Console.WriteLine("This year is a Leap year!");
                }
            }
            else
            {
                Console.WriteLine("This year is Not a Leap year!");
            }

            Console.ReadLine();
        }
    }
}
