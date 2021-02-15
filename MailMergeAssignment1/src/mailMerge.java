import java.util.Scanner;
public class mailMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		Scanner in = new Scanner(System.in);

		
		
		String replaceText1 = "Dear firstName lastName,";
		String replaceText2 = "Please confirm that your address is houseNumber street.";
		String replaceText3 = "Your answer is: yORn Goodbye!";
		String promptText1 = "Please enter your first name: ";
		String promptText2 = "Please enter your last name: ";
		String promptText3 = "Please enter your house number: ";
		String promptText4 = "Please enter your street: ";
		String promptText5 = "Is this address correct? ";
		
		System.out.println(promptText1);
		String first = in.nextLine();
		
		System.out.println(promptText2);
		String last = in.nextLine();
		
		System.out.println(promptText3);
		String numOfhouse = in.nextLine();
		
		System.out.println(promptText4);
		String streetName = in.nextLine();
		
		
		replaceText1 = replaceText1.replace("firstName", first);
		replaceText1 = replaceText1.replace("lastName", last);
		System.out.println(replaceText1);
		replaceText2 = replaceText2.replace("houseNumber", numOfhouse);
		replaceText2 = replaceText2.replace("street", streetName);
		System.out.println(replaceText2);
		
		System.out.println(promptText5);
		String correct = in.nextLine();
		
		replaceText3 = replaceText3.replace("yORn", correct);
		System.out.println(replaceText3);
		in.close();
	}

}
