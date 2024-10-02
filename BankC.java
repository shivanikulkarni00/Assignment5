package assi5;

public class BankC extends Bank{
	 private int balance;

	   
	    public BankC(int balance) {
	        this.balance = balance;
	    }

	   
	    @Override
	    public int getBalance() {
	        return balance;
	    }

	 
	    @Override
	    public double applyInterest(int balance) {
	        return super.applyInterest(balance); // Apply interest to the balance
	    }
	}

