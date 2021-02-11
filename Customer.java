
	import java.util.Scanner;

	public class Customer {
		String name;
		String surname;
		int customer_id;
		Account account;
		int LegalEntityNumber=0;
		
		public Customer() {
			Scanner myScanner=new Scanner(System.in);
			
			System.out.println("Name:");
			name=myScanner.nextLine();
			
			System.out.println("Surname:");
			surname=myScanner.nextLine();
			customer_id=0;
		}

		
	}


