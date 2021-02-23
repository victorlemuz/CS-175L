
import java.util.Scanner;


public class BankAccountTester {

	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	System.out.print("Enter starting balance: ");
	double startBal = in.nextDouble();
	BankAccount myBankAccount = new BankAccount(startBal);
	
	System.out.print("Enter how much you would like to winthraw ");
	double withdrawl = in.nextDouble();
	myBankAccount.withdraw(withdrawl);
	
	System.out.print("Enter how much you would like to deposit ");
	double deposit = in.nextDouble();
	myBankAccount.deposit(deposit);
	
	
	System.out.println("Your balance is: $" + myBankAccount.balance);
	
		
		
		
		
		
	}

}
