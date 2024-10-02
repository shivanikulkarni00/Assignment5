package assi5;

public class classB extends Bank {
	private int balance;

    
    public classB(int balance) {
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