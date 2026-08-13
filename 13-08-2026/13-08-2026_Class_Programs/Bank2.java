package day1308;

class BankAccount2{
	static String BankName = "Mariyamman Indian Bank";
	private int accountNumber;
	private String acccountHolderName;
	private String mobileNumber;
	private String accountType;
	private double balance;
	
	

	
	BankAccount2(int accountNumber,String acccountHolderName,String mobileNumber,String accountType,double balance){
		this.accountNumber = accountNumber;
		this.acccountHolderName=acccountHolderName;
		this.mobileNumber=mobileNumber;
		this.accountType=accountType;
		this.balance=balance;
	}	
		// 4. Getter methods
	    public int getAccountNumber() { 
	    		return accountNumber;
	    }
	    public String getAccountHolderName() { 
	    		return acccountHolderName; 
	    	}
	    public String getMobileNumber() { 
	    		return mobileNumber;
	    	}
	    public String getAccountType() { 
	    		return accountType;
	    	}
	    public double getBalance() { 
	    		return balance; 
	    	}
	    
	    public void setMobileNumber(String mobileNumber){
	    	this.mobileNumber = mobileNumber;
	    }
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
		public void display() {
			System.out.println("------------------------------------");
			System.out.println("------"+BankName+"-------");
			System.out.println("------------------------------------");
			System.out.println("AccountNumber :"+accountNumber);
			System.out.println("acccountHolderName :"+acccountHolderName);
			System.out.println("mobileNumber :"+mobileNumber);
			System.out.println("accountType :"+accountType);
			System.out.println("balance : Rs."+balance);
			System.out.println("-------------------------------------");
			
		}
		
	}

public class Bank2 {
	public static void main(String[] args) {
		
		BankAccount2 b1 = new BankAccount2(1001, "Dinesh", "9876543210", "Savings", 25000);
		BankAccount2 b2 = new BankAccount2(1001, "Guru", "123456t7890", "Current", 5000);
		
		System.out.println("Balance : "+b1.getBalance());
		b1.deposit(5000);
		System.out.println("Balance : "+b1.getBalance());
		b2.deposit(20000);
		System.out.println("Balance : "+b2.getBalance());
		b2.display();
		b1.display();
		b2.setMobileNumber("99999999");
		b2.display();
		
		
	}

}
