// Write a program in java for the following pattern
//         1
//       1 2 1
//     1 2 3 2 1
//   1 2 3 4 3 2 1


public class Fifth {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            // Print increasing numbers
            for (int k = 1; k < i; k++) {
                System.out.print(k+" ");
            }
            // Print decreasing numbers
            for (int l = i; l >= 1; l--) {
                System.out.print(l +" ");
            }
            System.out.println();
        }
    }
}