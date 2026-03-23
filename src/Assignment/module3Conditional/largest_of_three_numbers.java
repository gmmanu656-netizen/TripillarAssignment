package Assignment.module3Conditional;
import java.util.Scanner;
public class largest_of_three_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number n1 : ");
        int n1=sc.nextInt();
        System.out.println("Enter number n2 : ");
        int n2=sc.nextInt();
        System.out.println("Enter number n3 : ");
        int n3=sc.nextInt();
        if(n1>n2 && n1>n3)
            System.out.println("largest = "+n1);
        else if(n2>n3)
            System.out.println("largest = "+n2);
        else
            System.out.println("largest = "+n3);
    }
}
