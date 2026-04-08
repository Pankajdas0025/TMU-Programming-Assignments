/*
A bank intends to design a program to display the denomination of an input amount, upto 5 digits. The available denominations with the bank are of rupees 1000,500, 100, 50, 20, 10, 5, 2 and 1. Design a program to accept the amount from the user and display the break-up in descending order of denominations. (i,e preference should be given to the highest denomination available) along with the total number of notes. [Note: only the denomination used should be displayed]. Example 1: INPUT: 14836 OUTPUTS: ONE FOUR EIGHT THREE SIX DENOMINATIONS:
1000 X 14 =14000
500 X 1 =500
100 X 3 =300
50 X 1 =50
5 X 1 =5
1 X 1 =1 , EXAMPLE 2: INPUT: 235001 OUTPUT: INVALID AMOUNT

*/

using System;
namespace a20;
class Program{
    static void Main(){
    Console.WriteLine("Enter an amount (up to 5 digits):");
    int amount=Convert.ToInt32(Console.ReadLine());
    if(amount<0||amount>99999){Console.WriteLine("INVALID AMOUNT");return;}
    Console.WriteLine("Denominations:");
    int[] denominations={1000,500,100,50,20,10,5,2,1};
    int totalNotes=0;
    foreach(int denomination in denominations){
    int count=amount/denomination;
    if(count>0){
        Console.WriteLine(denomination+" X "+count+" = "+(denomination*count));
        totalNotes+=count;
        amount-=denomination*count;
    }}
    Console.WriteLine("Total number of notes: "+totalNotes);
}}