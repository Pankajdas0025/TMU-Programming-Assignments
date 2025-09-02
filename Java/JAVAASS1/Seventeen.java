// Write a program which illustrates the concept of super
// keyword at variable and method level.

public class Seventeen extends Sixteen {
    private int a, b;

    // Constructor with 'super' keyword
    public Seventeen(int a, int b) {
        super(a, b); // Call the constructor of the parent class Sixteen
        this.a = a;
        this.b = b;
    }

    // Method to display the sum
    public void displaySum() {
        System.out.println("The Sum Is: " + (this.a + this.b));
    }

    public static void main(String[] args) {
        Seventeen obj = new Seventeen(5, 10);
        obj.displaySum(); // Call the method to display the sum
    }
}