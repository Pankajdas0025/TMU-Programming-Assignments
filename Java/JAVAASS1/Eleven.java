// Write a program to illustrate the concept of this keyword.




    public class Eleven {
        private int a, b;

        // Constructor with 'this' keyword
        public Eleven(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public void displaySum() {
            System.out.println("The Sum Is: " + (this.a + this.b));
        }

        public static void main(String[] args) {


            // Creating an object of Eleven class using 'this' keyword
            Eleven obj = new Eleven(100 , 200);
            obj.displaySum();
        }
    }