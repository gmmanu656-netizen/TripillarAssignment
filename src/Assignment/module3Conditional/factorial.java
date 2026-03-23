package Assignment.module3Conditional;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        int F=1;
        for(int i=1; i<=n; i++)
        {
            F=F*i;
        }
        System.out.println("factorial = "+F);
    }
}
