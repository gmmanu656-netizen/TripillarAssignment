package Assignment.module2Basics;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        double a=sc.nextDouble();
        System.out.println("Enter the second number");
        double b= sc.nextDouble();
        System.out.println("Enter the operator");
        System.out.println("Addition:"+(a+b));
        System.out.println("Subtraction:"+(a-b));
        System.out.println("Multiplication:"+(a*b));
        System.out.println("Division:"+(a/b));


    }
}
