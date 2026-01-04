// class MyThread extends Thread {
//     public void run() {
//         System.out.println("Thread is running...");
//     }
//     public static void main(String[] args) {
//         MyThread t = new MyThread();
//         t.start(); // starts a new thread
//     }
// }








class MyTask implements Runnable {
    public void run() {
        System.out.println("Task is running...");
    }
}

class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new MyTask());
        t.start();
    }
}
