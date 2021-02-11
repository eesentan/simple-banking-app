

	import java.util.Scanner;

	public class Individual extends Customer {
		int SSN;
		String input;
		
		public void NumberAssign() {
			super.LegalEntityNumber=SSN;
		}
		
		public Individual() {
			 super();
			 Scanner myScanner=new Scanner(System.in);
			 System.out.println("Enter your Social Security Number:");
			 input=myScanner.nextLine();
			 SSN=Integer.parseInt(input);
			 NumberAssign();
		}
	}


