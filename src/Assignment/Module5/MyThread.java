package Assignment.Module5;

public class MyThread implements Runnable{


        public void run() {
            System.out.println("Thread is running using Runnable interface");
        }
    }

    class Runnableexample {
        public static void main(String[] args) {

            MyThread obj = new MyThread();   // create object
            Thread t1 = new Thread(obj);     // create thread

            t1.start();                      // start thread
        }
    }

