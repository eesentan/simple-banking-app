

public class CarLoan extends Loan{

	double DepreciationRate;
	public CarLoan() {
		
	}
	@Override 
	public void CalculateBalance() {
		if(Period == 12) {
			APR=3;
			DepreciationRate = 5;
		}
		if(Period == 24) {
			APR=4;
			DepreciationRate =7;
		}
		if(Period == 36) {
			APR =4.5;
			DepreciationRate = 10.0;
		}
		if(Period == 48) {
			APR = 5.5;
			DepreciationRate = 12.0;
		}
		
	}
	
}
