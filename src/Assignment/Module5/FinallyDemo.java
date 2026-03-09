package Assignment.Module5;

public class FinallyDemo {

        public static void main(String[] args) {
            try {
                int data = 25 / 5;
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                System.out.println("Finally block executed");
            }
        }
    }

