package abstraction;

public class Atm  implements Bank{
int balance=2000;
	@Override
	public void deposit(int amt) {
		System.out.println("Amount Deposited successfully");
		balance=balance+amt;
		
	}

	@Override
	public void withDraw(int amt) {
		System.out.println("Amount withdrawn successfully");
		
		balance=balance-amt;
		
	}

	@Override
	public void checkBalance() {
	System.out.println(" Available balance in your account is "+balance);
		
	}

}
