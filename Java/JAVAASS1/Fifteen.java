// Write a program to demonstrate the concept of method
// overloading and overriding.


public class Fifteen {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to demonstrate overriding
    public void display() {
        System.out.println("This is the original display method.");
    }

    public static void main(String[] args)
    {
        Fifteen obj = new Fifteen();

        // Demonstrating method overloading
        System.out.println("Sum of two numbers: " + obj.add(5, 10));
        System.out.println("Sum of three numbers: " + obj.add(5, 10, 15));

        // Demonstrating method overriding
        obj.display();
    }
}