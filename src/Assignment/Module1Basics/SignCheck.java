package Assignment.Module1Basics;

import java.util.Scanner;

public class SignCheck {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        if(n>0){
            System.out.println(n + " is a positive number");
        } else if (n<0) {
            System.out.println(n + " is a negative number");
        }
        else{
            System.out.println(n + " is a zero");
        }
    }
}
