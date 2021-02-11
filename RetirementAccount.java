
import java.util.Scanner;

public class RetirementAccount extends Account{
	
	Scanner myScanner = new Scanner(System.in);
	
	public void IBAN() {
		super.name="Retirement Account";
		super.IBAN=(super.accountNumber+1)*111111;
	}
	
	public RetirementAccount() {
		IBAN();
	
	}
	@Override
	public void CalculateBalance() {
		if(Period == 12) {
			InterestRate = 2;
		}
		if(Period == 24) {
			InterestRate= 2.25;
		}
		if(Period == 36) {
			InterestRate = 2.5;
		}
		if(Period == 48) {
			InterestRate = 3.25;
		}
	}
}


