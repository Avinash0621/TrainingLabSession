package LabSession.July25;


//Class: SavingsAccount
class SavingsAccount implements Account {
	private double balance;
	private final double interestRate = 0.04; // 4%

	public SavingsAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited to Savings Account : " + amount);
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdrew from Savings Account : " + amount);
		} 
		else {
			System.out.println("Insufficient balance in Savings Account");
		}
	}

	public double calculateInterest() {
		return balance * interestRate;
	}

	public void addInterest() {
		double interest = calculateInterest();
		balance += interest;
		System.out.println("Interest added to Savings Account : " + interest);
	}

	public void viewBalance() {
		System.out.println("Savings Account Balance : " + balance);
	}
}