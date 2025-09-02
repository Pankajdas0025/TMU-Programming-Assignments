// Write a Java Program to demonstrate use of nested
// class.

public class Sixteen {
    // Outer class
    class Inner {
        // Method in the inner class
        void display() {
            System.out.println("This is the inner class method.");
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the outer class
        Sixteen outer = new Sixteen();

        // Creating an instance of the inner class
        Inner inner = outer.new Inner();

        // Calling the method of the inner class
        inner.display();
    }
}