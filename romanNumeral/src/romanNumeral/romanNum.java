package romanNumeral;
import javax.swing.JOptionPane;
public class romanNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String numeral = "";
		
		String romanNum = JOptionPane.showInputDialog("Enter a number: ");
		int num = Integer.parseInt(romanNum);
		
		int x = 0;
		
		if (num <= 3999)
		{
		//1000
		if(num >= 1000)
		{
		
		x = num -(num%1000);
		
			while (x > 0)
			{
				x-= 1000;
				numeral = numeral + "M";
			
			}
			num = num%1000;
		}
		//900
		
		if(num >= 900)
		{
			numeral = numeral + "CM";

			num = num%900;
		}
		if(num >= 500)
		{
		//500

			numeral = numeral + "D";
			num = num%500;
		}
		if(num >= 400)
		{
		//400
		
			numeral = numeral + "CD";
			num = num%400;
		}
		//100
		if(num >= 100)
		{
		
		x = num -(num%100);
	
			while (x > 0)
			{
				x-= 100;
				numeral = numeral + "C";
			
			}
			num = num%100;
		}
		//90
		if(num >= 90)
		{
			numeral = numeral + "XC";

			num = num%90;
		}
		if(num >= 50)
		{
		//50

			numeral = numeral + "L";
			num = num%50;
		}
		if(num >= 40)
		{
		//40
		
			numeral = numeral + "XL";
			num = num%40;
		}
		//10
		if(num >= 10)
		{
		
		x = num -(num%10);
	
			while (x > 0)
			{
				x-= 10;
				numeral = numeral + "X";
			
			}
			num = num%10;
		}
		//9
		if(num >= 9)
		{
			numeral = numeral + "IX";

			num = num%9;
		}
		if(num >= 5)
		{
		//5

			numeral = numeral + "V";
			num = num%5;
		}
		if(num >= 4)
		{
		//4
		
			numeral = numeral + "IV";
			num = num%4;
		}
		//1
		if(num >= 1)
		{
		
		x = num -(num%1);
	
			while (x > 0)
			{
				x-= 1;
				numeral = numeral + "I";
			
			}
			num = num%1;
		}
		JOptionPane.showMessageDialog(null, numeral);
		
	}
}
}
	


