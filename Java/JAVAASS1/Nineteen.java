// Write a program to demonstrate use of implementing
// and extends interfaces.


public class Nineteen implements InterfaceExample {
    // Implementing the method from the interface
    @Override
    public void display() {
        System.out.println("This is the implementation of the display method from the interface.");
    }

    public static void main(String[] args) {
        Nineteen obj = new Nineteen();
        obj.display(); // Calling the implemented method
    }
}