// Write a program to demonstrate use of implementing
// and extends interfaces.

interface A{ void displayA();}
interface B{ void displayB();}

class Nineteen implements A,B {

public void displayA()
{
System.out.println("Inheritance A Display ");
}


public void displayB()
{
System.out.println("Inheritance B Display ");
}


public static void main (String [] args)

{
Nineteen n = new Nineteen();
n.displayA();
n.displayB();
}

}
