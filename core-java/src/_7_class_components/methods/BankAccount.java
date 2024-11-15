package _7_class_components.methods;

public class BankAccount {
    int id;
    String name;
    int balance;

    void checkBalance() {
        //System.out.println("current balance is "+balance);
        System.out.println("current balance is " + this.balance);
    }

    void deposit(int amount) {
        //balance = balance + amount;
        this.balance = this.balance + amount;
    }

    void withdraw(int amount) {
        //balance = balance - amount;
        this.balance = this.balance - amount;
    }

    static void bankDetails() {
        System.out.println("SBI JM road Pune");
    }

    public static void main(String[] args) {
        //instance method call from anothe static method --> reference
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        bankAccount.checkBalance();

        //static method call from another static method ---> classname
        //bankDetails();
        //bankAccount.bankDetails();
        BankAccount.bankDetails();

        System.out.println("calling display method");
        bankAccount.display();
    }

    void display() {

        //deposit(1000);
        this.deposit(1000);

        //withdraw(100);
        this.withdraw(100);

        //checkBalance();
        this.checkBalance();
        //bankDetails();
        //this.bankDetails();
        BankAccount.bankDetails();
    }

}
