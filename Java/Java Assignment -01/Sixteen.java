// Write a Java Program to demonstrate use of nested
// class.




public class Sixteen

{

class SixteenInner
{

    void display()
    {
System.out.println("This is Inner Class Of Sixteen");
    }
}

public static void main (String args[])
{
Sixteen obj1 =  new Sixteen();

SixteenInner obj2 = obj1.new SixteenInner();

obj2.display();
}

}
