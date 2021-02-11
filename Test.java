
import java.util.*;
import java.lang.Exception;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;


	public class Test {
		public static void main(String[] args) {
			int select=0;
			int subselect=0;
			final int countCustomer=0;
			int countAccount=0;
			int countLoan=0;
			int SearchID=0;
			int SearchAccount=0;
			String input;
			
			
			ArrayList<Customer> customerList = new ArrayList<Customer>();
			ArrayList<Account> accountList = new ArrayList<Account>();
			ArrayList<Loan> loanList = new ArrayList<Loan>();
			Map<Customer, ArrayList<Account>> customerMap = new HashMap<>();
			Scanner myScanner=new Scanner(System.in);
		
			 
			 DefaultListModel<String> liste = new DefaultListModel<>();  
			
			 
			
		     liste.addElement("Add a new customer");  
		     liste.addElement("Add a new account");  
		     liste.addElement("Add a new loan");  
		     liste.addElement("Deposit money"); 
		     liste.addElement("Withdraw money"); 
		     liste.addElement("Display account info"); 
		     liste.addElement("Display all accounts for customer"); 
		     liste.addElement("Display all calculated balances"); 
		     liste.addElement("EXIT"); 
			 
	         
			JFrame myFrame = new JFrame("MENU");
			myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			myFrame.setVisible(true);
			
			
			myFrame.setBounds(100, 100, 80, 80);
			myFrame.setResizable(true);
			JList<String> myList = new JList<>(liste);    // JList
		    myList.setBounds(100, 100, 200, 200);
			myFrame.add(myList);
			myFrame.setSize(400, 400);
			myFrame.setLayout(new FlowLayout());
		
			JButton myButton = new JButton("OK");
			myFrame.add(myButton);
			/*myButton.setBounds(80, 80, 200, 100);
			myButton.setSize(60, 80);
			*/
	 
	        
	          myButton.addActionListener(new ActionListener()
	          {  
	        	  
			  	@Override
	        	  public void actionPerformed(ActionEvent e){  
			  		int choice = myList.getSelectedIndex();
			  		switch(choice) {
			  		case 0:
			  			 JFrame customerFrame = new JFrame("Add new customer");  //Second Frame
			  		       
			    		  customerFrame.setLayout(new FlowLayout());
			      		  customerFrame.setResizable(true);
			      		  customerFrame.setBounds(200,200,200,200);
			      		  customerFrame.setVisible(true);
			      		  
			      		  
			      		  JRadioButton radioButton = new JRadioButton("Individual Customer");  //JRadioButton
			    		  JRadioButton radioButton2 = new JRadioButton("Company Customer");
			    		  JRadioButton radioButton3 = new JRadioButton("Charity Customer");
			    		  
			    		  ButtonGroup group = new ButtonGroup();
			      		  group.add(radioButton);
			      		  group.add(radioButton2);
			      		  group.add(radioButton3);
			      		  
			      		
			      		  
			    		  radioButton.setVisible(true);
			    		  radioButton2.setVisible(true);
			    		  radioButton3.setVisible(true);

			    		  
			    		  radioButton.setBounds(20, 50, 100, 100);
			    		  radioButton2.setBounds(130, 175, 100, 100);
			    		  radioButton3.setBounds(240, 280, 100, 100);
			    		 
			    		  customerFrame.add(radioButton);
			    		  customerFrame.add(radioButton2);
			    		  customerFrame.add(radioButton3);
			    		  
			    		  JButton customerButton = new JButton("OK");  
			    		  customerFrame.add(customerButton);
					      int choice2 = myList.getSelectedIndex();
					      
					      switch(choice2) {
					     	case 0:  //  kullanici individual customer secerse
					     	{
					     		
					    		  customerButton.addActionListener(new ActionListener()
						          {  
								  	@Override
						        	  public void actionPerformed(ActionEvent e){  
								  		JFrame individualFrame = new JFrame("Indiviual Customer");
								  		
								  		individualFrame.setLayout(new FlowLayout());
							      		individualFrame.setResizable(true);
							      		individualFrame.setBounds(200,200,200,200);
							      		individualFrame.setVisible(true);
							      		
							      		int choice2 = myList.getSelectedIndex();
									   
							      		
										  		JTextField name = new JTextField("Name");
										  		JTextField surname = new JTextField("Surname");
										  		name.setBounds(50, 50, 100, 100);
										  		surname.setBounds(50, 50, 100, 100);
										  		individualFrame.add(name);
										  		individualFrame.add(surname);
										  		
										  		JButton addCustomerButton = new JButton("OK");
										  		individualFrame.add(addCustomerButton);
										  		addCustomerButton.addActionListener(new ActionListener()
										  		{
										  			@Override
										  			public void actionPerformed(ActionEvent e){  
										  				customerList.add(new Individual());
														customerList.get(countCustomer).customer_id=(countCustomer+1000);
														System.out.println("You have created a Customer with ID: "+ (countCustomer+1000) + "\n");
														//countCustomer++;
										  			}
										  		});
										  				
										  				
										  				
										  		
										
										  		
									 
								  	}
						          });
					     	}
					     	case 1: //  kullanici company customer secerse
					     		
					     		
			  		}
	        			
		        }  
			  }
				  
		    }); 
		
				if(select==1) {
					System.out.println("(1) Individual Customer.\r\n" + 
							"(2) Company Customer.\r\n" + 
							"(3) Charity Customer.\r\n");
					input=myScanner.nextLine();
					subselect=Integer.parseInt(input);
					
					if(subselect==1) {
						customerList.add(new Individual());
						customerList.get(countCustomer).customer_id=(countCustomer+1000);
						System.out.println("You have created a Customer with ID: "+ (countCustomer+1000) + "\n");
						//countCustomer++;
					}
					if(subselect==2) {
						customerList.add(new Company());
						customerList.get(countCustomer).customer_id=(countCustomer+1000);
						System.out.println("You have created a Customer with ID: "+ (countCustomer+1000) + "\n");
						//countCustomer++;
					}
					if(subselect==3) {
						customerList.add(new Charity());
						customerList.get(countCustomer).customer_id=(countCustomer+1000);
						System.out.println("You have created a Customer with ID: "+ (countCustomer+1000) + "\n");
						//countCustomer++;
					}
					
				}
				
				else if(select==2) {
					int flag=0;
					System.out.println("Customer ID:");
					input=myScanner.nextLine();
					SearchID=Integer.parseInt(input);
					for(int i=0;i<countCustomer;i++) {
						if(customerList.get(i).customer_id==SearchID) {
							System.out.println("(1) Checking Account\r\n" + 
									"(2) Saving Account\r\n" + 
									"(3) Euro Account\r\n" + 
									"(4) Retirement Account\r\n");
							input=myScanner.nextLine();
							subselect=Integer.parseInt(input);
							
							if(subselect==1) {
								ArrayList<Account> map_accountList = new ArrayList<Account>();
								accountList.add(new CheckingAccount());		
								accountList.get(countAccount).customer = customerList.get(i);
								accountList.get(countAccount).accountNumber=countAccount+10000;
								map_accountList=accountList;
								customerMap.put(customerList.get(i), map_accountList);
								countAccount++;
							}
							if(subselect==2) {
								
								ArrayList<Account> map_accountList = new ArrayList<Account>();
								accountList.add(new SavingsAccount());
								accountList.get(countAccount).customer = customerList.get(i);
								accountList.get(countAccount).accountNumber=countAccount+10000;
								map_accountList=accountList;
								customerMap.put(customerList.get(i), map_accountList);
								countAccount++;
								for(i=0;i<countLoan;i++) {
									System.out.println("APR = " +loanList.get(i).APR);
								}
								
							}
							if(subselect==3) {
								ArrayList<Account> map_accountList = new ArrayList<Account>();
								accountList.add(new EuroAccount());
								accountList.get(countAccount).customer = customerList.get(i);
								accountList.get(countAccount).accountNumber=countAccount+10000;
								map_accountList=accountList;
								customerMap.put(customerList.get(i), map_accountList);
								countAccount++;
								for(i=0;i<countLoan;i++) {
									System.out.println("APR = " +loanList.get(i).APR);
								}
							}
							if(subselect==4) {
								ArrayList<Account> map_accountList = new ArrayList<Account>();
								if((customerList.get(i) instanceof Company)||(customerList.get(i) instanceof Charity)) {
									System.out.println("\nYou are not able to have Retirement Account!!\n");
								}
								else {
									accountList.add(new RetirementAccount());
									accountList.get(countAccount).customer = customerList.get(i);
									accountList.get(countAccount).accountNumber=countAccount+10000;
									map_accountList=accountList;
									customerMap.put(customerList.get(i), map_accountList); 
									countAccount++;
									for(i=0;i<countLoan;i++) {
										System.out.println("APR = " +loanList.get(i).APR);
									}
								}
							}
							flag=1;
													
						}
					}
					if(flag==0) {
						System.out.println("No matching ID!");
					}
				}
				else if(select == 3) {  // add new loan
					System.out.println("Enter customer ID:");
					input=myScanner.nextLine();
					SearchID=Integer.parseInt(input);
					for(int i=0;i<countCustomer;i++) {
						if(customerList.get(i).customer_id==SearchID) {
							System.out.println("Please choice your loan type:\n");
							System.out.println("(1)Car Loan\n(2)Personal Loan\n(3)Mortgage Loan\n");
							input=myScanner.nextLine();
							subselect=Integer.parseInt(input);
							if(subselect == 1) {
								loanList.add(new CarLoan());
								loanList.get(countLoan).CalculateBalance();
								System.out.println("APR = " +loanList.get(i).APR);
								
							}
							if(subselect == 2) {
								loanList.add(new PersonalLoan());
								loanList.get(countLoan).CalculateBalance();
								System.out.println("APR = " +loanList.get(i).APR);
							}
							if(subselect == 3) {
								loanList.add(new MortgageLoan());
								loanList.get(countLoan).CalculateBalance();
								System.out.println("APR = " +loanList.get(i).APR);
								
							}
						}
					}
				}
				 
				else if(select==4) {
					int flag=0;
					int deposit=0;
					while(true) {
						try {
							System.out.println("Account Number:");
							input=myScanner.nextLine();
							SearchAccount =Integer.parseInt(input);
							break;
						}
						catch (InputMismatchException exception) {
							System.out.println("Error! You must enter a number !\n");
							myScanner.nextLine();
							continue;
						}
					}
					
					for(int i=0;i<countAccount;i++) {
						if(accountList.get(i).accountNumber==SearchAccount) {
							while(true) {
								try {
									System.out.println("How much money you want to deposit:");
									input=myScanner.nextLine();
									deposit=Integer.parseInt(input);	
									break;
								}
								catch(InputMismatchException exception) {
									System.out.println("Error! You must enter a number !\n");
									myScanner.nextLine();
									continue;
								}
							}
								
							accountList.get(i).balance+=deposit;
							int j=0;
							while(accountList.get(i).accountHistory[j]!='\0') {
								j++;
							}
							accountList.get(i).accountHistory[j]=deposit;
							flag=1;
						}
					}
					if(flag==0) {
						System.out.println("No matching Account Number!");
					}
				}
					else if(select==5) {
						int flag2=0;
						int withdraw=0;
						while(true) {
							try {
								System.out.println("Account Number:");
								input=myScanner.nextLine();
								SearchAccount =Integer.parseInt(input);	
								break;
							}
							catch(InputMismatchException exception) {
								System.out.println("Error! You must enter a number !\n");
								myScanner.nextLine();
								continue;
							}
						}
								
						for(int i=0;i<countAccount;i++) {
							if(accountList.get(i).accountNumber==SearchAccount) {
								if(accountList.get(i) instanceof RetirementAccount) {
									System.out.println("\nYou have Retirement Account. You are not allowed to withdraw money!!\n");
								}
								else {
									while(true) {
										try {
											
											System.out.println("How much money you want to withdraw:");
											input=myScanner.nextLine();
											withdraw=Integer.parseInt(input);
											if((accountList.get(i).balance-withdraw)<0) {
												throw new InSufficientFundException("Insufficient Fund");
											}
											break;
										}
										catch(InSufficientFundException exception) {
											System.out.println("\nYou can't withdraw money more than you have!!\n");
											
											continue;
										}
									}
								}
							}
							
									accountList.get(i).balance-=withdraw;
									int j=0;
									while(accountList.get(i).accountHistory[j]!='\0') {
									j++;
									}
									accountList.get(i).accountHistory[j]=-withdraw;
									flag2=1;
								
								
								
							}
						
						if(flag2==0) {
							System.out.println("No matching Account Number!");
						}
					}
					
					else if(select==6) {
						int flag1=0;
						System.out.println("Account Number:");
						input=myScanner.nextLine();
						SearchAccount=Integer.parseInt(input);					
						for(int i=0;i<countAccount;i++) {
							if(accountList.get(i).accountNumber==SearchAccount) {
								flag1=1;
								System.out.println("\nName:" + accountList.get(i).customer.name + "\nSurname:" + accountList.get(i).customer.surname);
								System.out.println("\nCustomerID:" + accountList.get(i).customer.customer_id);
								if( accountList.get(i).customer instanceof Individual) {
									System.out.println("\nCustomer Type: Individual Customer\n");
									System.out.println("Social Security Number:" + accountList.get(i).customer.LegalEntityNumber);
								}
								else if( accountList.get(i).customer instanceof Company) {
									System.out.println("\nCustomer Type: Company Customer\n");
									System.out.println("Employer Identification Number:" + accountList.get(i).customer.LegalEntityNumber);
								}
								else if( accountList.get(i).customer instanceof Charity) {
									System.out.println("\nCustomer Type: Charity Customer\n");
									System.out.println("Charity Registration Number:" + accountList.get(i).customer.LegalEntityNumber);
								}
								
								
								if(accountList.get(i) instanceof CheckingAccount) {
									System.out.println("\nAccount Type: Checking Account.\n");
									System.out.println("\nIBAN:"+ accountList.get(i).IBAN);
								}
								else if(accountList.get(i) instanceof SavingsAccount) {
									System.out.println("\nAccount Type: Saving Account.\n");
									System.out.println("\nIBAN:"+ accountList.get(i).IBAN);
								}
								else if(accountList.get(i) instanceof EuroAccount) {
									System.out.println("\nAccount Type: Euro Account.\n");
									System.out.println("\nIBAN:"+ accountList.get(i).IBAN);
								}
								else if(accountList.get(i) instanceof RetirementAccount) {
									System.out.println("\nAccount Type: Retirement Account.\n");
									System.out.println("\nIBAN:"+ accountList.get(i).IBAN);
								}
								System.out.println("\nAccount opening date: "+ accountList.get(i).openDate);
								System.out.println("Balance: "+ accountList.get(i).balance);
								int k = 0;
								while(accountList.get(i).accountHistory[k]!='\0') {
									System.out.println(accountList.get(i).accountHistory[k]);
									k++;
								}
								
		
							}
						}
						if(flag1==0) {
							System.out.println("No matching ID!");
						}
					}
					else if(select==7) {
						Iterator<Map.Entry<Customer, ArrayList<Account>>> iterator = customerMap.entrySet().iterator();
						System.out.println("Customer ID:");
						
						String input1=myScanner.nextLine();
						int SearchCustomer=Integer.parseInt(input1);
						
						for(int i=0; i<customerList.size();i++) {
							if(SearchCustomer == customerList.get(i).customer_id) {
								while(iterator.hasNext()) {
									Map.Entry<Customer, ArrayList<Account>> entry = iterator.next();
									if(entry.getKey().customer_id==SearchCustomer){ 
						            System.out.println("Customer = " + entry.getKey().name + " " + entry.getKey().surname
						            		+"\nCustomer id:"+ entry.getKey().customer_id);
						            for(int j=0;j<entry.getValue().size();j++) {
						            	if(entry.getValue().get(j).customer.customer_id==SearchCustomer) {
						            		System.out.println("\nAccount Type: "+ entry.getValue().get(j).name);
							            	System.out.println("\nAccount opening date: "+ entry.getValue().get(j).openDate);
											System.out.println("Balance: "+ entry.getValue().get(j).balance);
											int k = 0;
											while(entry.getValue().get(j).accountHistory[k]!='\0') {
												System.out.println(entry.getValue().get(j).accountHistory[k]);
												k++;
											}
						            	}
						            	
						            }
						         
									
									}
							}		
							}
						}
						
				              
				        } 
				
					else if(select==8) {   // display all calculated balances
						Iterator<Map.Entry<Customer, ArrayList<Account>>> iterator = customerMap.entrySet().iterator();
						System.out.println("Enter customer ID:");
						String input1=myScanner.nextLine();
						int SearchCustomer=Integer.parseInt(input1);
						
						for(int i=0;i<countCustomer;i++) {
							if(customerList.get(i).customer_id==SearchID) {
								while(iterator.hasNext()) {
									Map.Entry<Customer, ArrayList<Account>> entry = iterator.next();
									if(entry.getKey().customer_id==SearchCustomer){ 
										System.out.println("Customer = " + entry.getKey().name + " " + entry.getKey().surname
							            		+"\nCustomer id:"+ entry.getKey().customer_id);
							            for(int j=0;j<entry.getValue().size();j++) {
							            	if(entry.getValue().get(j).customer.customer_id==SearchCustomer) {
							            		System.out.println("\nAccount Type: "+ entry.getValue().get(j).name);
								            	System.out.println("\nAccount opening date: "+ entry.getValue().get(j).openDate);
												System.out.println("Balance: "+ entry.getValue().get(j).balance);
												int k = 0;
												while(entry.getValue().get(j).accountHistory[k]!='\0') {
													System.out.println(entry.getValue().get(j).accountHistory[k]);
													k++;
												}
							            	}
							            }
									}
								}
							}
						}
						
						for(int j=0 ;j<countLoan; j++) {
							if(loanList.get(j) instanceof CarLoan) {
								System.out.println("Loan Type: " +loanList.get(j));
							}
							if(loanList.get(j) instanceof PersonalLoan) {
								System.out.println("Loan Type : " +loanList.get(j));
							}
							if(loanList.get(j) instanceof MortgageLoan) {
								System.out.println("Loan Type: " +loanList.get(j));
							}
							
						}
						
					}
					else if(select == 9) {
						JButton exitButton = new JButton("Exit");
						
						myFrame.setContentPane(exitButton);
						
						JButton exit_ok = new JButton("OK");  
			    		  myFrame.add(exit_ok);
			    		  exit_ok.addActionListener(new ActionListener()
				          {  
						  	@Override
				        	  public void actionPerformed(ActionEvent e){  
						  		System.exit(0);
						  	}
				          });
						
					}
				
		}
		}

			

	

