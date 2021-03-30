import java.util.Scanner;
public class BankThreshold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter starting balance: ");
		double startBal = in.nextDouble();
		System.out.print("Enter the interest: ");
		double interestPct = in.nextDouble();
		
		BankAccount myBankAccount = new BankAccount(startBal, interestPct);
		
		System.out.println("Enter a threshold: ");
		
		
		while (in.hasNextDouble())
		{int months = 0;
			double numb = in.nextDouble();
			System.out.println(numb);
			while (myBankAccount.getBalance() < numb)
			{myBankAccount.calcInterest();
				months++;
			}
			System.out.println("It will take " + months + " months.");
		}
		
		
		
		
	}

}
