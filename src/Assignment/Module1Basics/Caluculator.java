package Assignment.module1Basics;

class Calculator {
    void add(int a, int b) {
        System.out.println("Addition answer is: " + (a + b));
    }

    void subtract(int a, int b) {
        System.out.println("Subtraction answer is: " + (a - b));
    }

    static void main(String[] args) {
        Calculator add = new Calculator();
        Calculator subtract = new Calculator();
        add.add(10, 20);
        subtract.subtract(10, 20);
    }
}