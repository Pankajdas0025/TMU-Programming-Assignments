using System;
namespace A4{
class Program{
    static void Main(string[] args){
        Console.Write("Enter Your Marks: ");
        int marks=Convert.ToInt32(Console.ReadLine());
        if(marks>90) {Console.WriteLine("A+ grade");}
        else if(marks>80){ Console.WriteLine("A grade");}
        else if(marks>70) {Console.WriteLine("B+ grade");}
        else if(marks>60) {Console.WriteLine("B grade");}
        else if(marks>50) {Console.WriteLine("C grade");}
        else Console.WriteLine("Fail");
        Console.ReadLine();
}}}