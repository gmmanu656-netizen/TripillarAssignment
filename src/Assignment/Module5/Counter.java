package Assignment.Module5;

public class Counter {

        private int count = 0;

        // The 'synchronized' keyword locks the object so
        // only one thread can increment at a time.
        public synchronized void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    class sharedcounter {
        public static void main(String[] args) throws InterruptedException {
            Counter sharedCounter = new Counter();

            // Thread 1
            Thread t1 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) {
                    sharedCounter.increment();
                }
            });

            // Thread 2
            Thread t2 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) {
                    sharedCounter.increment();
                }
            });

            t1.start();
            t2.start();

            // Wait for both threads to finish before printing
            t1.join();
            t2.join();

            System.out.println("Final Count: " + sharedCounter.getCount());
        }
    }

