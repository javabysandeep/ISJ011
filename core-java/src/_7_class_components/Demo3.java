package _7_class_components;

public class Demo3 {
    public static void main(String[] args) {
        BankAccount satishKaBankAccount = new BankAccount();
        //accountNumber = 0, accountBalance = 0, name= null
        System.out.println("Account number "+satishKaBankAccount.accountNumber);
        System.out.println("Account Balance "+satishKaBankAccount.balance);
        System.out.println("Account Holder Name  "+satishKaBankAccount.accountHolderName);

        BankAccount utkarsha = new BankAccount();
        //accountNumber = 0, accountBalance = 0, name= null


        satishKaBankAccount.deposit(10000);
        utkarsha.deposit(20000);

        System.out.println("Account Balance updated "+satishKaBankAccount.balance);
        System.out.println("Account Balance updated "+utkarsha.balance);


        satishKaBankAccount.bankName = "HDFC";

        System.out.println(BankAccount.bankName);
        System.out.println(BankAccount.bankName);


    }
}
