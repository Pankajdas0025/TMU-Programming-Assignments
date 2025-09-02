// Write program to demonstrate use of final keyword.


import java.util.Scanner;

public class Fourth
 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = number.nextInt();
        System.out.print("Enter second number: ");
        int b = number.nextInt();

        final int sum = a + b; // Using final keyword to declare a constant
        System.out.println("The Sum Is: " + sum);
    }
}