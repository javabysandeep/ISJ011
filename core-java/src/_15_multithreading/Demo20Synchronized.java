package _15_multithreading;

import lombok.*;

public class Demo20Synchronized {
    public static void main(String[] args) throws InterruptedException {
        @NoArgsConstructor
        @AllArgsConstructor
        @Getter
        @Setter
        @ToString
        class BankAccount {
            private int accountNumber;
            private double balance;
            private String accountHolderName;

            synchronized public void deposit(double amount) {
                balance += amount;
            }

            synchronized public void withdraw(double amount) {
                balance -= amount;
            }

            synchronized public double checkBalance() {
                return balance;
            }

            void print() throws InterruptedException {
                wait();
            }
        }

        BankAccount bankAccount = new BankAccount(1, 1000d, "Kunal");

        Thread atm = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                bankAccount.withdraw(1);
            }
        }, "atm");
        Thread upi = new Thread(() -> {
            for (int i = 1; i <= 900; i++) {
                bankAccount.deposit(1);
            }
        }, "upi");
        Thread netBanking = new Thread(() -> {
            for (int i = 1; i <= 200; i++) {
                bankAccount.withdraw(1);
            }
        }, "netBanking");

        atm.start();
        upi.start();
        netBanking.start();


        atm.join();
        upi.join();
        netBanking.join();
        bankAccount.print();


        System.out.println("Current balance is : " + bankAccount.getBalance());

    }
}
