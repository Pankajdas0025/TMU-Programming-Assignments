// 1. Write a program to implement the concept of
// Exception Handling using predefined
// Exception.
class ExceptionDemo

{
    public static void main(String args[])

    {
        int a=10,b=0,c;

        try

        {
            c=a/b;

            System.out.println("Result = "+c);

        }

        catch(ArithmeticException e)

        {

            System.out.println("Division by zero is not possible");

        }

  try

        {
            int arr[]=new int[5];
            arr[10]=50;

            System.out.println(arr[10]);

        }

        catch(ArrayIndexOutOfBoundsException e)

        {

            System.out.println("Array index is out of bounds
            ");

        }


        finally

        {

            System.out.println("Finally block executed");

        }

        System.out.println("End of program");

    }
}