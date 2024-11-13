package _6_class_object.demos;

public class Demo2 {
    public static void main(String[] args) {
        //static int a = 100; //CTE
        int b = 100;

        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();
        BankAccount bankAccount3 = new BankAccount();
        BankAccount bankAccount4 = new BankAccount();
        BankAccount bankAccount5 = new BankAccount();


        bankAccount1.customerId = 1;
        bankAccount1.accountNumber = 12345;
        bankAccount1.accountHolderName = "Ganesh";
        bankAccount1.balance = 123456;

        System.out.println("first account details");
        System.out.println(
                "BankAccount{" +
                        "customerId=" + bankAccount1.customerId +
                        ", accountNumber=" + bankAccount1.accountNumber +
                        ", accountHolderName='" + bankAccount1.accountHolderName + '\'' +
                        ", balance=" + bankAccount1.balance +
                        '}'
        );

        System.out.println("second account details");
        System.out.println(
                "BankAccount{" +
                        "customerId=" + bankAccount2.customerId +
                        ", accountNumber=" + bankAccount2.accountNumber +
                        ", accountHolderName='" + bankAccount2.accountHolderName + '\'' +
                        ", balance=" + bankAccount2.balance +
                        '}'
        );

        System.out.println("third account details");
        System.out.println(
                "BankAccount{" +
                        "customerId=" + bankAccount3.customerId +
                        ", accountNumber=" + bankAccount3.accountNumber +
                        ", accountHolderName='" + bankAccount3.accountHolderName + '\'' +
                        ", balance=" + bankAccount3.balance +
                        '}'
        );

        System.out.println("fourth account details");
        System.out.println(
                "BankAccount{" +
                        "customerId=" + bankAccount4.customerId +
                        ", accountNumber=" + bankAccount4.accountNumber +
                        ", accountHolderName='" + bankAccount4.accountHolderName + '\'' +
                        ", balance=" + bankAccount4.balance +
                        '}'
        );

        System.out.println("fifth account details");
        System.out.println(
                "BankAccount{" +
                        "customerId=" + bankAccount5.customerId +
                        ", accountNumber=" + bankAccount5.accountNumber +
                        ", accountHolderName='" + bankAccount5.accountHolderName + '\'' +
                        ", balance=" + bankAccount5.balance +
                        '}'
        );
        System.out.println("Bank name is "+BankAccount.bankName);
        System.out.println(bankAccount1.bankName);
        System.out.println(bankAccount2.bankName);
        System.out.println(bankAccount3.bankName);
        System.out.println(bankAccount4.bankName);
        System.out.println(bankAccount5.bankName);
    }
}
