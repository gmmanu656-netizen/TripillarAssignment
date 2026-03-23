package Assignment.module1Basics;

public class BankAccount {
    int AccountNumber;
    int Balance;
    BankAccount(int AccountNumber, int Balance) {
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
        System.out.println("initial balance of account " + AccountNumber +" "+ "is: " + Balance);
    }
    void deposit(int Deposit) {
        this.Balance = this.Balance + Deposit;
        System.out.println( "Amount deposited to " + AccountNumber + " is:" + Deposit );
        System.out.println( " Total Balance is : " + Balance );
    }
    void withdraw(int Withdrawl) {
        System.out.println( "Withdraw of " + AccountNumber + " is: " + Withdrawl );
        this.Balance = this.Balance - Withdrawl;
        System.out.println("Total Balance is : " + Balance );
    }

    static void main(String[] args) {
        BankAccount b1 = new BankAccount(1,1000);
        BankAccount b2 = new BankAccount(2,2000);
        b1.deposit(100);
        b2.deposit(500);
        b1.withdraw(50);
        b2.withdraw(200);
    }
}