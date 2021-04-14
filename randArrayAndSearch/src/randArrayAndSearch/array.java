package randArrayAndSearch;
import java.util.Random;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int largest = 0;
		int smallest = 26;
		
		
		Random generator = new Random();
		int[] array = new int[50];
		
		for(int i = 0; i < array.length; i ++)
		{
			array[i] = 1 + generator.nextInt(25);
			System.out.print(array[i] + " ");
			if (array[i] > largest)
			{
				largest = array[i];
			}
			if(array[i] < smallest)
			{
				smallest = array[i];
			}
			
		}
		System.out.println();
		System.out.println("Largest: " + largest);
		System.out.println("Smallest: " + smallest);
		System.out.println("Product: " + (largest*smallest));
		
		
		
	}

}
