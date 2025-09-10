
// Write a program to demonstrate the concept of method
// overloading and overriding.

public class Fifteen
{
    int add(int a ,  int b )

    {
        return a+b;
    }

    double add(double a , double b)
    {
        return a+b;
    }
}


class OverrideExample extends Fifteen

{

    @Override
    int add(int a , int b )
    {
        return a + b + 120 ;
    }

    public static void main (String [] args)
    {
Fifteen obj1 = new Fifteen();
System.out.println("OverloadExample add(int) = "+ obj1.add(10 , 50));
System.out.println("OverloadExample add(double) = "+ obj1.add(10.50, 50.50));


OverrideExample obj2 = new OverrideExample();
System.out.println("Overriden Example add(int) = "+ obj2.add(10 , 50));
    }
}
