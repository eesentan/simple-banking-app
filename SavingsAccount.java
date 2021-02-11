
import java.util.Scanner;

public class SavingsAccount extends Account{
	
	
	Scanner myScanner = new Scanner(System.in);
	public void IBAN() {
		super.name="Saving Account";
		super.IBAN=(super.accountNumber+1)*111111;
	}
	
	public SavingsAccount() {
		IBAN();
		
	}
	
	@Override
	public void CalculateBalance() {
		if(Period == 12) {
			InterestRate = 3;
		}
		if(Period == 24) {
			InterestRate= 4;
		}
		if(Period == 36) {
			InterestRate = 4.5;
		}
		if(Period == 48) {
			InterestRate = 5.5;
		}
	}
}


