
	import java.util.Scanner;

	public class Company extends Customer {
		int EIN;
		String input;
		
		public void NumberAssign() {
			super.LegalEntityNumber=EIN;
		}
		
		public Company() {
			super();
			Scanner myScanner=new Scanner(System.in);
			System.out.println("Enter your Employer Identification Number:");
			input=myScanner.nextLine();
			EIN=Integer.parseInt(input);
			NumberAssign();
		}
	}


