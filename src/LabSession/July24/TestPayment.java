package LabSession.July24;

//Base class
class Payment {
	void pay() {
		System.out.println("Payment method selected.");
	}
}

//Child class - CreditCard
class CreditCard extends Payment {
	@Override
 	void pay() {
     	System.out.println("Paying using Credit Card.");
 	}
}

//Child class - UPI
class UPI extends Payment {
	@Override
	void pay() {
		System.out.println("Paying using UPI.");
	}
}

//Child class - NetBanking
class NetBanking extends Payment {
	@Override
	void pay() {
		System.out.println("Paying using Net Banking.");
	}
}

public class TestPayment {
	public static void main(String[] args) {

		Payment p1 = new CreditCard();
		Payment p2 = new UPI();
		Payment p3 = new NetBanking();

		p1.pay();  
		p2.pay();  
		p3.pay();  
	}
}
