
// Write a program which illustrates the concept of
// inheritance.

public class Fourteen

{
    void display1()
    {
        System.out.println("Fourteen is Paraen Class");
    }
}

class  Sub extends Fourteen {
void display2()
    {
        System.out.println("Child Class");
    }


    public static void main (String [] args)

    {
Sub obj = new Sub();
obj.display1();
obj.display2();
    }

}