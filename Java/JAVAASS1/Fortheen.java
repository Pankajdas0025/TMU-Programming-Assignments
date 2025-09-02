// Write a program which illustrates the concept of
// // inheritance.

public class Fortheen extends Tenth {
    // Constructor for Fortheen class
    public Fortheen(int a, int b) {
        super(a, b); // Call the constructor of the parent class Tenth
    }

    public static void main(String[] args) {
        // Create an instance of Fortheen class
        Fortheen obj = new Fortheen(5, 10);
        obj.displaySum(); // Call the method from the parent class to display the sum
    }
}