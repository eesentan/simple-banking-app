

public class PersonalLoan extends Loan{

	String Guarantor;
	public PersonalLoan() {
		
	}
	@Override 
	public void CalculateBalance() {
		if(Period == 12) {
			APR = 5;
		}
		if(Period == 24) {
			APR=5.5;
		}
		if(Period == 36) {
			APR = 6.75;
		}
		if(Period == 48) {
			APR = 8;
		}
	}
}
