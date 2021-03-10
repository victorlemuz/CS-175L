import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.util.Scanner;


		 public class RoachSimulation 
		 {
	     public static void main(String[] args)
		 {
	     
		 Scanner in = new Scanner(System.in);
		 
		 
		 String input = JOptionPane.showInputDialog("The Initial Roach population is ");
		 double initialPop = Double.parseDouble(input);
		 
		 RoachPopulation bugs = new RoachPopulation(initialPop);
		 DecimalFormat wholeFormat = new DecimalFormat("0");
		 JOptionPane.showMessageDialog(null, "Enter starting roach population: " + wholeFormat.format(bugs.getRoachPopulation()));
		      
		 int sP = 0;
		 int x = 1;
		 while (x < 5)
		 {
		    	bugs.breed();
		    	JOptionPane.showMessageDialog(null, "The Roach Population after cycle " + x + " breeding is " + wholeFormat.format(bugs.getRoachPopulation()));
		    	if (x == 1) {
		    		String inputTwo = JOptionPane.showInputDialog("Enter spray percent: ");
		    		sP = Integer.parseInt(inputTwo);
		    		
		    	}
		    	bugs.spray(sP);
		    	JOptionPane.showMessageDialog(null, "The Roach Population after cycle " + x + " " + sP + " percent spraying is " + wholeFormat.format(bugs.getRoachPopulation()));
		    	sP = sP + 10;
		    	x++;
		    	
		      
		   
		      
		      
		   
		 }


	}

}