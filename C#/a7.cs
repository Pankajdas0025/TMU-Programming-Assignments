//7. WCP to perform various string operations.
using System;
namespace A7
{
    class Program
    {
        static void Main(string[] args)
        {
            String text = "Hello World";
            Console.WriteLine("String Length: " + text.Length);
            Console.WriteLine("String to UpperCase: " + text.ToUpper());
            Console.WriteLine("String to LowerCase: " + text.ToLower());
            Console.WriteLine("Sub String: " + text.Substring(0,3));
            Console.WriteLine("Sub String: " + text.Replace("World", "India"));
            Console.ReadLine();

        }

    }
}
