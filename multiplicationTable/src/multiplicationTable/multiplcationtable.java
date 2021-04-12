package multiplicationTable;
import java.util.Scanner;

public class multiplcationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int a;
		int b;
		for (a=1; a<=10; ++a)
		{
		    for (b=1; b<=10; ++b)
		    {
		    	System.out.printf("%4d", (a*b));  
		    }
		    System.out.println();
	}
	}
}
