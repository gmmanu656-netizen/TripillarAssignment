package Assignment.Module5;

public class demonstrate {

        public static void main(String[] args) throws InterruptedException {
            // 1. NEW State
            Thread thread = new Thread(() -> {
                try {
                    // 3. TIMED_WAITING State (while sleeping)
                    Thread.sleep(1000);
                    System.out.println("Thread inside run(): " + Thread.currentThread().getState());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            System.out.println("State after creation: " + thread.getState()); // NEW

            // 2. RUNNABLE State
            thread.start();
            System.out.println("State after start(): " + thread.getState()); // RUNNABLE

            // Give the thread a moment to enter the sleep block
            Thread.sleep(200);
            System.out.println("State while sleeping: " + thread.getState()); // TIMED_WAITING

            // Wait for thread to finish
            thread.join();

            // 4. TERMINATED State
            System.out.println("State after completion: " + thread.getState()); // TERMINATED
        }
    }

