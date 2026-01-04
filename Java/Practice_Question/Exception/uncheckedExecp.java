package Exception;

public class uncheckedExecp {

    public static void main (String args[])
    {
        try
        {
            int a = 10;
            int  b = 0;
            int c = a / b; // This will cause ArithmeticException
            System.out.println("Result: " + c);

        }
        catch (ArithmeticException e)
        {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
    }



}

