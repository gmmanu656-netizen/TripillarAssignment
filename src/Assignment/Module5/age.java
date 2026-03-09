package Assignment.Module5;

public class age {

        public static void main(String[] args) {

            int age = 16;

            try {
                if (age < 18) {
                    throw new Exception("Age is less than 18");
                }
                System.out.println("You are eligible");

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

