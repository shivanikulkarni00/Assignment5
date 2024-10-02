package assi5;

public class Bank {
	static double interestRate = 0.05; //  rate (5%)
    public int getBalance() {
        return 0;
    }

    public double applyInterest(int balance) {
        return balance + (balance * interestRate); // Interest calculation
    }
}
