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

        System.out.println("End of program");

    }
}