package assi5;

public class BankA extends Bank {
	private int balance;

    
    public BankA(int balance) {
        this.balance = balance;
    }

    
    @Override
    public int getBalance() {
        return balance;
        }
        public double applyInterest(int balance) {
            return super.applyInterest(balance); // Apply interest 
        

}
    }
