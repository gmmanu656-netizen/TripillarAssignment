package Assignment.Module5;

public class Printer {

        private int counter = 1;
        private final int limit = 10;

        // Synchronized method ensures only one thread can access the logic
        public synchronized void printNumbers(int remainder) {
            while (counter <= limit) {
                // Check if it's NOT this thread's turn
                // Thread 1 handles remainder 1 (1, 3, 5...)
                // Thread 2 handles remainder 0 (2, 4, 6...)
                while (counter % 2 != remainder && counter <= limit) {
                    try {
                        wait(); // Step aside and wait for the other thread
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

                if (counter <= limit) {
                    System.out.println(Thread.currentThread().getName() + ": " + counter);
                    counter++;
                    notify(); // Wake up the other thread
                }
            }
        }
    }
    class AlternativeThreads {
        public static void main(String[] args) {
            Printer printer = new Printer();

            // Create Odd Thread
            Thread t1 = new Thread(() -> printer.printNumbers(1), "Odd-Thread");

            // Create Even Thread
            Thread t2 = new Thread(() -> printer.printNumbers(0), "Even-Thread");

            t1.start();
            t2.start();
        }
    }

