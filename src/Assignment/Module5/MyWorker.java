package Assignment.Module5;

public class MyWorker extends Thread{

    // 1. Create a class that extends Thread

        @Override
        public void run() {
            // This is the code that will run in the new thread
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " is processing: " + i);
                try {
                    Thread.sleep(500); // Mimic work
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted!");
                }
            }
        }
    }

    class Threadclass {
        public static void main(String[] args) {
            // 2. Create an instance and start it
            MyWorker thread1 = new MyWorker();
            thread1.setName("Worker-Alpha");

            // Use .start(), NOT .run()!
            thread1.start();

            System.out.println("Main thread is still running independently...");
        }
    }

