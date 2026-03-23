package Assignment.module2Basics;
import java.util.Scanner;
public class Question5a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        double a=sc.nextDouble();
        System.out.println("Enter the second number:");
        double b= sc.nextDouble();
        System.out.println("Before swapping:"+a+" "+b);
        double temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping:"+a+" "+b);


    }
}
