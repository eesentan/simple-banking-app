


public class CheckingAccount extends Account{
	
	public void IBAN() {
		super.name="Checking Account";
		super.IBAN=(super.accountNumber+1)*111111;
	}
	
	public CheckingAccount() {
		IBAN();
	}
	@Override
	public void CalculateBalance() {
		
	}
}


