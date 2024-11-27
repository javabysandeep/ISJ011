package _8_oops.inheritance;

public class CurrentBankAccount {
    int accountNumber;
    double balance;
    String accountHolderName;
    double interestRate = 0.0;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void printBalance() {
        System.out.println("Balance: " + balance);
    }

}
