package Assignment.module3Conditional;
import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        if (year%4==0)
            System.out.println("leap year");
        else
            System.out.println("not a leap year");
    }
}
