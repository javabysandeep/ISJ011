package _8_oops.inheritance;

public class SavingsBankAccount {
    int accountNumber;
    double balance;
    String accountHolderName;
    double interestRate;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void printBalance() {
        System.out.println("Balance: " + balance);
    }

    public void calculateInterestRate() {
        interestRate = balance / 100;
    }
}
