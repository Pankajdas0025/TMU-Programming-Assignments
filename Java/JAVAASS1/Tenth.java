// Write a program that will illustrate the concept of
// parameterized constructor and object parameterized
// constructor


import java.util.Scanner;
public class Tenth {
    private int a, b;

    // Parameterized constructor
    public Tenth(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void displaySum() {
        System.out.println("The Sum Is: " + (a + b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        // Creating an object of Tenth class using parameterized constructor
        Tenth obj = new Tenth(firstNumber, secondNumber);
        obj.displaySum();
    }
}