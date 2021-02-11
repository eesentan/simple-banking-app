import java.util.Scanner;

	public abstract class Account implements AnnualAccountable{
		String name;
		int accountNumber;
		String openDate;
		int balance;
		Date date;
		Customer customer;
		int[] accountHistory = new int[10];
		int IBAN;
		static int i =0;
		double amont;
		double InterestRate;
		int Period;
		Scanner myScanner = new Scanner(System.in);

		public Account() {	
			
			
			balance=0;
			Date date = new Date();
			IBAN=0;
			openDate = date.Sday + "/" +date.Smonth + "/" + date.Syear;
			accountNumber = i+10000;
			
			System.out.printf("Account number:%d\n",accountNumber);
			i++;
			int x=0;
			for(;x<10;x++)  {
				accountHistory[x]=0;
			
			}
		}
		public void getPeriod() {
		
		System.out.println("Period: ");
		Period = myScanner.nextInt();
		
		System.out.println("Amont : ");
		amont = myScanner.nextDouble();
		}
		
		
	}

	

