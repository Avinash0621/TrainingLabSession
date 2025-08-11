package LabSession.July25;

public class BankingTest {
public static void main(String[] args) {
   // Create accounts
   SavingsAccount savings = new SavingsAccount(1000);
   CurrentAccount current = new CurrentAccount(1000);

   // Operations on SavingsAccount
   savings.deposit(2000);
   savings.withdraw(3000);
   savings.addInterest();
   savings.viewBalance();

   System.out.println();

   // Operations on CurrentAccount
   current.deposit(1000);
   current.withdraw(7000);
   current.checkOverdraftStatus();
   current.viewBalance();
}
}
