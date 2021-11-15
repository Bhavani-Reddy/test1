package JUnit5;

import junit.framework.Test;

public class BankAcc {
	
	double accBanlance;
	

	
	public BankAcc(double accBanlance) {
		super();
		this.accBanlance = accBanlance;
	}

	void withDreaw(double withDrawAmt) throws InsufficientFundsException {
		
		if(withDrawAmt>accBanlance)
			throw new InsufficientFundsException("InsufficientFundsException");
		
		accBanlance=accBanlance-withDrawAmt;
		
		System.out.println("Amount WithDrawn: "+withDrawAmt);
		System.out.println("Available Balance: "+accBanlance);
	}
	
	public static void main(String[] args) {
		
		BankAcc acc1=new BankAcc(20000.00);

		try {
			acc1.withDreaw(10000.00);
		} catch (InsufficientFundsException e) {
		
			e.printStackTrace();
		}
		
	}

}
 class InsufficientFundsException extends Exception {
	
	public InsufficientFundsException(String msg) {
		super(msg);
	}

}
