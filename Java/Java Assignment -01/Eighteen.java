// Write a program which will calculate the sum of two
// integer and two floats values using an abstract method
// sum()



abstract class Eighteen
{
    abstract void sum(int a , float b , float c );
}
class Child extends Eighteen
{


    void sum(int a , float b , float c )

    {

    float result = a + b +c;
    System.out.println("Sum is : "+ result);
    }

    public static void main (String [] args)
    {
         Child c = new Child();
         c.sum(10 , 20.5f , 25.5f);
    }
}
