package _7_class_components.methods;

public class CallByValueObjectsDem02 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.id = 101;
        bankAccount.name = "kunal";
        bankAccount.balance = 1000;

        change(bankAccount);

        System.out.println("id " + bankAccount.id + "\t" +
                "name " + bankAccount.name + "\t" +
                "balance " + bankAccount.balance
        );
        //101 kunal 1000

    }

    public static void change(BankAccount bankAccount) {
        bankAccount = new BankAccount();
        bankAccount.id = 99;
        bankAccount.name = "sachin";
        bankAccount.balance = 90000;

        System.out.println("id " + bankAccount.id + "\t" +
                "name " + bankAccount.name + "\t" +
                "balance " + bankAccount.balance
        );

        //99 sachine 90000
    }
}
