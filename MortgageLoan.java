

public class MortgageLoan extends Loan{

	double InsuranceRate;
	public MortgageLoan() {
		
	}
	@Override 
	public void CalculateBalance() {
		if(Period == 12) {
			APR = 2;
			InsuranceRate =4;
		}
		if(Period == 24) {
			APR=2.25;
			InsuranceRate = 4.5;
		}
		if(Period == 36) {
			APR = 2.5;
			InsuranceRate = 4.75;
		}
		if(Period == 48) {
			APR = 3.25;
			InsuranceRate = 5;
		}
	}
}
