package _7_class_components;

public class BankAccount {
    int accountNumber;
    int balance;
    String accountHolderName;

    void deposit(int amount) {
        //this.balance = this.balance + amount;
        balance = balance + amount;
    }

    void withdraw(int amount) {
        balance = balance - amount;
    }
}
