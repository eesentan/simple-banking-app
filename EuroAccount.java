
import java.util.Scanner;
public class EuroAccount extends Account{
	
	Scanner myScanner = new Scanner(System.in);
	
	public void IBAN() {
		super.name="Euro Account";
		super.IBAN=(super.accountNumber+1)*111111;
	}
	
	public EuroAccount() {
		IBAN();
	
	}
	@Override
	public void CalculateBalance() {
		if(Period == 12) {
			InterestRate = 5;
		}
		if(Period == 24) {
			InterestRate= 5.5;
		}
		if(Period == 36) {
			InterestRate = 6.75;
		}
		if(Period == 48) {
			InterestRate = 8;
		}
	}
}


