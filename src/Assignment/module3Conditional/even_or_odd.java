package Assignment.module3Conditional;
import java.util.Scanner;
public class even_or_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        if(n%2==0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
}
