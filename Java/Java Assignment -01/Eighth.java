// Write a program in java which contains 10 elements
// and sort it in ascending order.

public class Eighth {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3, 7, 4, 6, 10, 9};

        // Sorting the array in ascending order
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    // Swap numbers[i] and numbers[j]
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        // Printing the sorted array
        System.out.print("Sorted Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}