// Write a program to implement the concept of
// Exception Handling using throw keyword.
class Throw

{

    static void validate(int age)

    {
        if(age<18)
        {
            throw new ArithmeticException("Not valid");
        }
        else
        {
            System.out.println("Welcome to vote");
        }
    }
    public static void main(String args[])
    {
        validate(19);
        System.out.println("End of program");
    }

}