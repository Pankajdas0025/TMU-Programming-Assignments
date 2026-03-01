    using System;
    namespace A5{
    class Program{
    static void Main(string[] args){
    Console.Write("Enter a number: ");
    int num=Convert.ToInt32(Console.ReadLine());
    int fact=1,temp=num;

    /* While Loop */
    while(temp!=0){fact=fact*temp;temp--;}
    Console.WriteLine("Factorial using While loop: "+fact);

    /* Reset Values */
    fact=1;temp=num;

    /* Do While Loop */
    do{fact=fact*temp;temp--;}while(temp>0);
    Console.WriteLine("Factorial using Do While loop: "+fact);

    /* Reset Values */
    fact=1;temp=num;

    /* For Loop */
    for(int i=1;i<=temp;i++) fact=i*fact;
    Console.WriteLine("Factorial using For loop: "+fact);

    Console.ReadLine();
    }}}