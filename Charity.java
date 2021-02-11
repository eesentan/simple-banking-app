

	import java.util.Scanner;

	public class Charity extends Customer{
		int CRN;
		String input;
		
		public void NumberAssign() {
			super.LegalEntityNumber=CRN;
		}
		
		public Charity() {
			super();
			Scanner myScanner=new Scanner(System.in);
			System.out.println("Enter your Charity Registration Number:");
			input=myScanner.nextLine();
			CRN=Integer.parseInt(input);
			NumberAssign();
		}
	}


