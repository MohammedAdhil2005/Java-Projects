import java.util.Scanner;

abstract class Account
{
	private int accountNumber;
	private String holderName;
	private double balance;
	
	Account(int accountNumber, String holderName, double balance)
	{
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public String getHolderName()
	{
		return holderName;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
}


//--------------------------------------------------------------------


class SavingsAccount extends Account
{
   SavingsAccount(int accountNumber, String holderName, double balance){
	super( accountNumber,  holderName,  balance);
   }
}


//--------------------------------------------------------------------


class CurrentAccount extends Account
{
	CurrentAccount(int accountNumber, String holderName, double balance){
	super( accountNumber,  holderName,  balance);
   }
}


//--------------------------------------------------------------------


//AccountNotFoundException

class AccountNotFoundException extends RuntimeException
{
	AccountNotFoundException(String s){
		super(s);
	}
}


//--------------------------------------------------------------------


//InvalidAmountException

class InvalidAmountException extends RuntimeException{
	InvalidAmountException(String s){
		super(s);
	}
}

//--------------------------------------------------------------------

//InsufficientBalanceException

class InsufficientBalanceException extends RuntimeException
{
	InsufficientBalanceException(String s){
	super(s);
	}
}

//--------------------------------------------------------------------

//InvalidNameException

class InvalidNameException extends RuntimeException
{
    InvalidNameException(String s)
    {
        super(s);
    }
}

//--------------------------------------------------------------------

class Bank
{
	static Account[] accounts=new Account[10];
	static int count;
	
	//--------------------------------------------------------------------
	
	//Display or find Account
	public static Account findAccount(int accountNumber){
		for(int i=0;i<count;i++){
			if(accounts[i].getAccountNumber()==accountNumber){
				return accounts[i];
			}
		}
		throw new AccountNotFoundException("AC NUMBER "+accountNumber+" NOT FOUND");
    }
	
	//--------------------------------------------------------------------
	
	//Deposit amount
	public static void deposit(int accountNumber, double amount) throws AccountNotFoundException, InvalidAmountException{
    Account a = findAccount(accountNumber);

    if(amount <= 0)
    {
        throw new InvalidAmountException("Deposit amount must be greater than zero.");
    }

    double newBalance = a.getBalance() + amount; // here we are adding the existing value and current value;

    a.setBalance(newBalance);

    System.out.println("\nAmount deposited successfully.\n");
    System.out.println("Current Balance: " + a.getBalance());
    }


    //-------------------------------------------------------------------- 
	
	//Withdraw Money
	public static void withdraw(int accountNumber,double amount) throws AccountNotFoundException, InvalidAmountException, InsufficientBalanceException{
    Account a = findAccount(accountNumber);
	
	if(amount<=0){
        throw new InvalidAmountException("Amount must be greater than zero.");
	}
	
    double CurrentBalance =a.getBalance();
	System.out.println("\nOld Balance is ---> "+CurrentBalance);
	
	if(CurrentBalance<amount){
		throw new InsufficientBalanceException("No sufficient money!!");
	}
	
	double newBalance = CurrentBalance-amount;
	a.setBalance(newBalance);
	
	System.out.println("\nAmount Withdraw Successfull !!!");
	System.out.println("\nNew Balance is ---> "+newBalance);
	
	}
	
	//-------------------------------------------------------------------- 
	
	//Transfer Money
	public static void transfer(int fromAccountNumber,int toAccountNumber,double amount) throws AccountNotFoundException, InvalidAmountException, InsufficientBalanceException {
		Account a1=findAccount(fromAccountNumber);
		Account a2=findAccount(toAccountNumber);
		
		if(amount<=0){
              throw new InvalidAmountException("Amount must be greater than zero.");
		}
		
		else if(a1.getBalance()<amount){
		      throw new InsufficientBalanceException("No sufficient money!!");
		}
		
		double fromBalance=a1.getBalance()-amount;
		a1.setBalance(fromBalance);
		
		double toBalance=a2.getBalance()+amount;
		a2.setBalance(toBalance);
		
	    System.out.println("\nAmount Transfer Successfull !!!");
	}
	
	//-------------------------------------------------------------------- 
	
	//Check Balance 
	public static void chack(int accountNumber){
	     Account a = findAccount(accountNumber);
		 
		 System.out.println("\n Your Balance is ---> "+a.getBalance());
	}
	
	//-------------------------------------------------------------------- 
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("-----------------------------------");
		System.out.println("BANK MANAGEMENT SYSTEM");
		System.out.println("-----------------------------------");
		
		System.out.println("press 1: Create Savings Account");
		System.out.println("press 2: Create Current Account");
		System.out.println("press 3: Display Account");
		System.out.println("press 4: Deposit");
		System.out.println("press 5: Withdraw");
		System.out.println("press 6: Transfer Money");
		System.out.println("press 7: Check balance");
		System.out.println("press 8: Caculate Interest");
		System.out.println("press 9: Exit");
		
		System.out.println("-----------------------------------");
		
		try
		{
		while(true)
		{
			
		System.out.print("\nEnter your Choice here: ");
		
		int choice=sc.nextInt();
		
		switch(choice){
			case 1:
			{
				System.out.println("\n-----------------------------------");
				System.out.println("\n-------CREATE YOUR SAVING'S ACCOUNT-------\n");
		        System.out.print("Enter your AC number: ");
				int accountNumber=sc.nextInt();
				
				System.out.print("Enter your Holder name: ");
				sc.nextLine();
				
	            String holderName=sc.nextLine();
				int namecount=0;
				
				for(int i=0;i<holderName.length();i++){
					namecount++;
				}
				
				if(namecount==0){
                   throw new InvalidNameException("Holder name cannot be empty.");
				}
				
				System.out.print("Enter your balance : ");
	            double balance=sc.nextDouble();
				
				SavingsAccount s=new SavingsAccount(accountNumber,holderName,balance);
				accounts[count++]=s;
				
		        System.out.println("\n-----------------------------------");
				System.out.println("   SAVINGS ACCOUNT DATA'S ARE ");
		        System.out.println("-----------------------------------\n");
				
				System.out.println("Your Account Number is --> "+s.getAccountNumber());
				System.out.println("Holder Name is --> "+s.getHolderName());
				System.out.println("Account balance is --> "+s.getBalance());
				
				System.out.println("\nAccount Created Successfully\n");
		        System.out.println("-----------------------------------");
				break;
				
			}
			
			//--------------------------------------------------------------------
			
			case 2:
			{
			    System.out.println("\n-----------------------------------");
				System.out.println("\n-------CREATE YOUR CURRENT ACCOUNT-------\n");
                System.out.print("Enter your AC number: ");
				int accountNumber=sc.nextInt();
				
				System.out.print("Enter your Holder name: ");
	            sc.nextLine();
				
	            String holderName=sc.nextLine();
				int namecount=0;
				
				for(int i=0;i<holderName.length();i++){
					namecount++;
				}
				
				if(namecount==0){
                   throw new InvalidNameException("Holder name cannot be empty.");
				}
				
				System.out.print("Enter your balance : ");
	            double balance=sc.nextDouble();
				
				CurrentAccount cs=new CurrentAccount(accountNumber,holderName,balance);
				
				accounts[count++]=cs;

		        System.out.println("\n-----------------------------------");
				System.out.println("   CURRENT ACCOUNT DATA'S ARE ");
		        System.out.println("-----------------------------------\n");
				
				System.out.println("Your Account Number is --> "+cs.getAccountNumber());
				System.out.println("Holder Name is --> "+cs.getHolderName());
				System.out.println("Account balance is --> "+cs.getBalance());
				
				System.out.println("\nAccount Created Successfully\n");
		        System.out.println("-----------------------------------");
		
				break;
			}
			
			//--------------------------------------------------------------------
			
			case 3:{
			    System.out.println("\n-----------------------------------");
				System.out.println("   SEARCH ACCOUNT ");
		        System.out.println("-----------------------------------\n");
				
				System.out.print("Enter Your AC number To Search --> ");
				int accountNumber=sc.nextInt();				
				
				try{
					
				Account a=findAccount(accountNumber);
				
				String accountType;
				
				if(a instanceof SavingsAccount){
					accountType="Savings Account";
				}
				
				else{
					accountType="Current Account";
				}
				
				
			    System.out.println("\n-----------------------------------");
				System.out.println("   YOUR ACCOUNT DETAILS ARE ");
			    System.out.println("-----------------------------------\n");
				
				System.out.println("Your Account Type is ---> "+accountType);
				System.out.println("\nAccount Number is --> "+a.getAccountNumber());
				System.out.println("Holder Name is --> "+a.getHolderName());
				System.out.println("Account balance is --> "+a.getBalance());
				}
				
				
				catch(AccountNotFoundException e){
					System.out.println("\nXXXXX "+e.getMessage()+" XXXXX");
				}
			    System.out.println("\n-----------------------------------");
				break;
			}
			
			//--------------------------------------------------------------------
			
			case 4:{
			    System.out.println("\n-----------------------------------");
				System.out.println("   DEPOSIT MONEY ");
		        System.out.println("-----------------------------------\n");
				
				System.out.print("Enter Account Number: ");
                int accountNumber = sc.nextInt();

                System.out.print("Enter Deposit Amount: ");
                double amount = sc.nextDouble();

                try
                {
                deposit(accountNumber, amount);
                }
				
                catch(AccountNotFoundException e)
                {
                System.out.println("\nXXXXX " + e.getMessage() + " XXXXX");
                }
				
                catch(InvalidAmountException e)
                {
                System.out.println("\nXXXXX " + e.getMessage() + " XXXXX");
                }
				
				System.out.println("\n-----------------------------------");
				break;
			}
			
			//--------------------------------------------------------------------
			
			case 5:{
			    System.out.println("\n-----------------------------------");
				System.out.println("   WITHDRAW MONEY ");
		        System.out.println("-----------------------------------\n");
				
				System.out.print("Enter Account Number: ");
                int accountNumber = sc.nextInt();

                System.out.print("Enter Withdraw Amount: ");
                double amount = sc.nextDouble();
				
				try{
					withdraw(accountNumber,amount);
				}
				
                catch(AccountNotFoundException e)
                {
                System.out.println("\nXXXXX " + e.getMessage() + " XXXXX");
                }
				
                catch(InvalidAmountException e)
                {
                System.out.println("\nXXXXX " + e.getMessage() + " XXXXX");
                }
				
				catch(InsufficientBalanceException e){
                System.out.println("\nXXXXX " + e.getMessage() + " XXXXX");
				}
				
		        System.out.println("\n-----------------------------------");
				
				break;
			}
			
			case 6:{
			    System.out.println("\n-----------------------------------");
				System.out.println("   TRANSFER MONEY ");
		        System.out.println("-----------------------------------\n");
				
				System.out.print("Enter FROM Account Number: ");
                int accountNumber1 = sc.nextInt();
				
				System.out.print("Enter TO Account Number: ");
                int accountNumber2 = sc.nextInt();

                System.out.print("Enter Tranfer Amount: ");
                double amount = sc.nextDouble();
				
				try{
				transfer(accountNumber1,accountNumber2,amount);
				}
				
				catch(AccountNotFoundException e)
                {
                System.out.println("\nXXXXX " + e.getMessage() + " XXXXX");
                }
				
                catch(InvalidAmountException e)
                {
                System.out.println("\nXXXXX " + e.getMessage() + " XXXXX");
                }
				
				catch(InsufficientBalanceException e)
				{
                System.out.println("\nXXXXX " + e.getMessage() + " XXXXX");
				}
				
			    System.out.println("\n-----------------------------------");
				
				break;
			}
			
			case 7:{
			    System.out.println("\n-----------------------------------");
				System.out.println("   CHECK BALANCE ");
		        System.out.println("-----------------------------------\n");
				
				System.out.print("Enter Account Number: ");
                int accountNumber = sc.nextInt();
				
                try{
				chack(accountNumber);
				}
				
				catch(AccountNotFoundException e){
                System.out.println("\nXXXXX " + e.getMessage() + " XXXXX");
				}
				
			    System.out.println("\n-----------------------------------");
								
				break;
			}
			
			case 8:{
			    System.out.println("CHECK INTEREST IS UNDER DEVELOPNMENT");
				break;
			}
			case 9:{
				System.out.println("\n-----------------------------------------------");
                System.out.println("| Thank you for using Bank Management System. |");
			    System.out.println("------------------------------------------------\n");
				return;
			}
			
			default:{
			    System.out.println("Enter Valid Field!!");
			}
		}
		
		}
		
		}
		
		finally{
			sc.close();
		}
	
	}
}

