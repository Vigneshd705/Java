class FibonacciThread extends Thread {
    private int n;

    public FibonacciThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        System.out.println("Thread for Fibonacci series started with priority: " + this.getPriority());
        calculateFibonacci(n);
    }

    private void calculateFibonacci(int n) {
        System.out.println("Fibonacci series for " + n + " terms:");
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();
    }
}

class ReverseThread extends Thread {
    private int number;

    public ReverseThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Thread for reversing number started with priority: " + this.getPriority());
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed number of " + number + " is: " + reversedNumber);
    }

    private int reverseNumber(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }
}

public class Threads {
    public static void main(String[] args) {
        // Create instances of the two thread classes
        Thread fibonacciThread = new FibonacciThread(10);
        Thread reverseThread = new ReverseThread(12345);

        // Set thread priorities
        fibonacciThread.setPriority(2);
        reverseThread.setPriority(1);

        fibonacciThread.start();
        reverseThread.start();

        try {
            fibonacciThread.join();
            reverseThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have finished.");
    }
}
