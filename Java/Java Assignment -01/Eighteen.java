// Write a program which will calculate the sum of two
// integer and two floats values using an abstract method
// sum()


public abstract class Eighteen {
    // Abstract method to calculate the sum
    public abstract void sum();

    public static void main(String[] args) {
        // Create an instance of the subclass to call the sum method
        Eighteen obj = new EighteenImpl();
        obj.sum();
    }
}