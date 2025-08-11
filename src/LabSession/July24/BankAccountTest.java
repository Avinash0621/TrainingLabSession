package LabSession.July24;

abstract class BankAccount {
	
    String accountNumber = "SA123";
    double balance = 10000;
    abstract double calculateInterest();

    void printBalance() {
        System.out.println("Account Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    final double interestRate = 0.04; // 4%

    @Override
    double calculateInterest() {
        return balance * interestRate;
    }
}

class FixedDepositAccount extends BankAccount {
    final double interestRate = 0.065; // 6.5%
    String accountNumber ="FD456";
    double balance = 20000;

    @Override
    double calculateInterest() {
        return balance * interestRate;
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount();
        BankAccount fd = new FixedDepositAccount();

        savings.printBalance();
        System.out.println("Interest on Savings Account: " + savings.calculateInterest());

        fd.printBalance();
        System.out.println("Interest on FD Account: " + fd.calculateInterest());
    }
}
