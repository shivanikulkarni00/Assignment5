package assi5;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        BankA bankA = new BankA(1000);
	        classB bankB = new classB(1500);
	        BankC bankC = new BankC(2000);

	         
	        System.out.println("Balance in Bank A: $" + bankA.getBalance());
	        System.out.println("Balance in Bank B: $" + bankB.getBalance());
	        System.out.println("Balance in Bank C: $" + bankC.getBalance());

	     
	        System.out.println("Balance in Bank A after interest: $" + bankA.applyInterest(bankA.getBalance()));
	        System.out.println("Balance in Bank B after interest: $" + bankB.applyInterest(bankB.getBalance()));
	        System.out.println("Balance in Bank C after interest: $" + bankC.applyInterest(bankC.getBalance()));
	    }
	}


