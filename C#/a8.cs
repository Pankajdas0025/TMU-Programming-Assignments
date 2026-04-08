using System;
namespace A8{
    class Program{
    static void Main(string[] args){
        int a=30,b=20;
        Console.WriteLine("Choice Option:\n1.Addition\n2.Subtract\n3.Multiplication\n4.Division\n");
        Console.Write("Enter your Choice:");
        int ch=Convert.ToInt32(Console.ReadLine());
        switch(ch){
        case 1: Console.WriteLine("Addition : "+(a+b)); break;
        case 2: Console.WriteLine("Subtraction : "+(a-b)); break;
        case 3: Console.WriteLine("Multiplication : "+(a*b)); break;
        case 4: Console.WriteLine("Division : "+(a/b)); break;
        default: Console.WriteLine("Invalid Choice !!"); break;
        }
    Console.ReadLine();
}}}