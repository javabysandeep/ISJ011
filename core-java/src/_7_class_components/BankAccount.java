package _7_class_components;

public class BankAccount {
    int accountNumber;
    int balance;
    String accountHolderName;
    static String bankName = "SBI";

    void deposit(int amount) {
        this.balance = this.balance + amount;
//        balance = balance + amount;
    }

    void withdraw(int amount) {
        balance = balance - amount;
    }

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        System.out.println(bankAccount.accountNumber);
        System.out.println(bankAccount.accountHolderName);
        System.out.println(bankAccount.balance);
        bankAccount.deposit(1000);
        bankAccount.withdraw(100);
    }
    public void checkBalance(){
        System.out.println(accountNumber);
        System.out.println(accountHolderName);
        System.out.println(balance);
        deposit(1000);
        withdraw(100);
    /*
        System.out.println(this.accountNumber);
        System.out.println(this.accountHolderName);
        System.out.println(this.balance);
        this. deposit(1000);
        this.withdraw(100);

        */
    }
}
