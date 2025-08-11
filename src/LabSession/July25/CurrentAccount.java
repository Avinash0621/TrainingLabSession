package LabSession.July25;

class CurrentAccount implements Account {
	private double balance;
	private final double overdraftLimit = 10000;

	public CurrentAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited to Current Account : " + amount);
	}

	public void withdraw(double amount) {
		if (balance + overdraftLimit >= amount) {
			balance -= amount;
			System.out.println("Withdrew from Current Account : " + amount);
		}
		else {
			System.out.println("Overdraft limit exceeded in Current Account");
		}
	}

	public double calculateInterest() {
		return 0; // No interest for current accounts
	}

	public void checkOverdraftStatus() {
		double available = overdraftLimit + Math.min(balance, 0);
		System.out.println("Overdraft remaining : " + available);
	}

	public void viewBalance() {
		System.out.println("Current Account Balance : " + balance);
	}
}
