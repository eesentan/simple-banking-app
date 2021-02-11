
import java.util.Scanner;

public abstract class Loan implements AnnualAccountable{

	double APR;
	int Period;
	double amont;
	String CustomerId;
	public Loan() {
	
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Period : ");
		Period = myScanner.nextInt();
		
		System.out.println("Amont :");
		amont = myScanner.nextDouble();
	}
}
