package Assignment.Module5;

public class ArithmeticDemo {

        public static void main(String[] args) {
            try {
                int result = 50 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

