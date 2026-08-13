package day1308;
class BankAccount{
	private double balance;
	
	public void deposit(double amount) {
		if(amount <= 0) {
			System.out.println("Invalid Amount");
			return;//This is for empty return 
		}
		balance += amount;
		System.out.println("Rs."+amount+" Deposited Successfully");
	}
	public void withdraw(double amount) {
		if(amount <= 0) {
			System.out.println("Invalid Amount");
			return;//This is for empty return 
		}
		else if(amount > balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			balance -= amount;
			System.out.println("Rs."+amount+" Withdrawn Successfully");
		}
	}
	public double getBalance() {
		return balance;
	}
}
public class Bank {
	public static void main(String[] args) {
	BankAccount ac = new BankAccount();
	System.out.println("Intial Balance : "+ac.getBalance());
	ac.deposit(10000);
	System.out.println("Intial Balance : "+ac.getBalance());
	ac.withdraw(5000);
	System.out.println("Intial Balance : "+ac.getBalance());
	ac.deposit(-3);
	System.out.println("Intial Balance : "+ac.getBalance());
	ac.withdraw(5000);
	System.out.println("Intial Balance : "+ac.getBalance());
	ac.withdraw(2000);
	System.out.println("Intial Balance : "+ac.getBalance());
	
	}
}
