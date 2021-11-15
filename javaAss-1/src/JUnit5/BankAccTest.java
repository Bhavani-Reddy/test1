package JUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccTest {

	@Test
	void test() {
		BankAcc acc1=new BankAcc(20000.00);
		
		assertThrows(InsufficientFundsException.class, ()->acc1.withDreaw(21000.0));

	}

}
