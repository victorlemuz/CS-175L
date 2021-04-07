import java.util.Scanner;
public class creditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);

		String cardNum;

		int n = 0;
		boolean run = true;
		while (run)
		{
			System.out.println("Please enter a credit card number or '-99' to end:");
			cardNum = in.nextLine();
			if (cardNum.contentEquals("-99")) {
				run = false;
				System.out.println("Goodbye");
			}
			else{
				while (n<cardNum.length()) {
					char cc = cardNum.charAt(n);
						if (cc=='-') 
						{
							String prev = cardNum.substring(0, n);	
							String after = cardNum.substring(n + 1);	
							cardNum = prev + after;
						}
						else if (cc==' ')	
						{	
							String prev = cardNum.substring(0, n);	
							String after = cardNum.substring(n +1);	
							cardNum = prev + after;
						}
						else
						{
							n++;
						}
				}
				System.out.println(cardNum);
				n=0;
				}	

		}

		}

	

		

	
		}

	


