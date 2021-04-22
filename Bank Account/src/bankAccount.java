import java.util.ArrayList;

public class bankAccount {

	
		// TODO Auto-generated method stub

		
		/**
		 * A bank account has a balance that can be changed by
		 * deposits and withdrawals
		 */
		
		
			private String name;
			private double balance;
			private int acct;
			private static int accountNumber = 0;
			private static double highest = 0;
			private static String n;
			public static void main(String[] args) 
			{
				bankAccount gil = new bankAccount("Gil", 500);
				bankAccount joe = new bankAccount("Joe", 1000);
				bankAccount fred = new bankAccount("Fred", 2000);
				bankAccount sally = new bankAccount("Sally", 2500);
				ArrayList<bankAccount> accountList = new ArrayList();
				accountList.add(gil);
				accountList.add(joe);
				accountList.add(fred);
				
				for(bankAccount element : accountList)
				{
					System.out.println(element.getAccount());
				}
				accountList.add(sally);
				
				for(bankAccount element : accountList)
				{
					if (element.getBalance() > highest)
					{
						highest = element.getBalance();
						n = element.getAccount();
					}
					
				}
				System.out.println("Highest: " + n);
				accountList.remove(sally);
				highest = 0;
				for(bankAccount element : accountList)
				{
					if(element.getBalance() > highest)
					{
						highest = element.getBalance();
						n = element.getAccount();
					}
					
				}
				System.out.println("Highest: " + n);
			}
			

			/**
			 * Constructs a bank account with a zero balance
			 */
			public bankAccount()
			{
				balance = 0;
			}
			/**
			 * Constructs a bank account with a given balance
			 * @param initialBalance the initial balance
			 */
			public bankAccount(String name,double initialBalance)
			{
				this.balance = initialBalance;
				this.name = name;
				accountNumber++;
				this.acct = accountNumber;
				
			}
			/**
			 * Deposits money into the bank account
			 * @param amount the amount to deposit
			 */
			public void deposit(double amount)
			{
				balance = balance + amount;
			}
			/**
			 * Withdraws money from the bank account
			 * @param amount the amount to withdraw
			 */
			public void withdraw(double amount)
			{
				if (amount>balance) 
				{
					throw new IllegalArgumentException("WD amount "+amount+" exceeds balance of "+balance);
				}
				balance = balance - amount;
			}
			/**
			 * Gets the current balance of the bank account
			 * @return the current balance
			 */
			public double getBalance()
			{
				return balance;
			}
			public String getAccount()
			{
				return this.name+" " + this.acct+" " + this.balance;
			}
			public double anyAccount(bankAccount otherAccount) 
			{
				return otherAccount.getBalance();
			}
			public void transfer(double amount,bankAccount otherAccount) 
			{
				balance = balance - amount;
				otherAccount.deposit(amount);
				
			}
			
	}


