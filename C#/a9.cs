// 9. WCP to declare & initialize various types of variables.
using System;
namespace A9
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = 100;
            float b = 3.14f;
            double c = 3.1510d;
            String e = "Hero";
            Char f = 'A';
            int [] arr = {10,20, 30};
            COnsole.WriteLine("Integer : " + a);
            Console.WriteLine("Float : " + b);
            Console.WriteLine("Double : " + c);
            Console.WriteLine("String : " + e);
            Console.WriteLine("Character : " + f);
            Console.Write("Array Elements: ");
            foreach(int element in arr) Console.Write(element+" ");
        }
    }
}
