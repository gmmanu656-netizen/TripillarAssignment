package Assignment.module2Basics;
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in degree Celsius:");
        double c= sc.nextDouble();
        double f=(c*9/5)+32;
        System.out.println("The temperature in degree Fahrenheit:"+f);


    }
}
