import java.util.Scanner;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Period;

public class ageCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
	
		String dob = JOptionPane.showInputDialog("Enter your birthday (YYYY-MM-DD)");
		LocalDate birthDate = LocalDate.parse(dob);
		
		
		String today = JOptionPane.showInputDialog("Enter today's date (MM/DD/YYYY)");
		LocalDate todayDate = LocalDate.now();
		
		int years = Period.between(birthDate, todayDate).getYears();
		int months = Period.between(birthDate, todayDate).getMonths();
		int days = Period.between(birthDate, todayDate).getDays();
		
		JOptionPane.showMessageDialog(null, "You are " + years + " , " + months + " month(s) old.");
		
		
		
		
	}

}
