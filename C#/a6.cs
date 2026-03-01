
//6. WCP to print table from 1-10.
using System;
namespace A6
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter a number to find table : ");
            int num = Convert.ToInt32(Console.ReadLine());

            for (int i=1; i<=10; i++)
            {
                Console.WriteLine(num + " * " +i +"=" + num*i);

            }
            Console.ReadLine();

        }
    }
}
