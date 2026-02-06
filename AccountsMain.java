package firsttask;

public class AccountsMain {

	
	static  class account {
	
		double balance;
		
		account(){
		  balance = 0 ;	
			
		}
		
		account(double balance){
			this.balance = balance;
			
		}
		
		void deposite (double amount){
			
			balance = balance + amount;
			System.out.println("Deposite the Amount : " + amount);
		}
		
		void withdraw (double amount) {
			if (amount <= balance) {
			balance = balance  - amount;			
			System.out.println("Wthdraw Amount      : " +amount);
			
		} else {
			System.out.println("Insuficiant Balance");
		}
		
	}

	void displaybalance(){
		
		System.out.println("Current Balance     : " + balance);
		}
		
	}
	
	public static void main (String[] args) {
		
		account acc = new account (1000);
		
		acc.displaybalance();
		acc.deposite(500);
		acc.withdraw(400);
		acc.displaybalance();
		
		
	}
	
	
	}
	
	
	
	
	

