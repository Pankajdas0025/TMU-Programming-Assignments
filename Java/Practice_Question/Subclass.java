abstract class AbstractClass
{

abstract void callAbstractClass();
}

public class Subclass extends AbstractClass
{
public void callAbstractClass()

{
    System.out.println("This is a Abstract Class Practice Question ");

}
public static void main (String [] args)

{
    Subclass obj =  new Subclass();
    obj.callAbstractClass();
}
}