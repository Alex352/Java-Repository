package excercises;
import java.util.Scanner;
public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double DOZEN_EGGS = 3.25;
		double SINGLE_EGG = .45;
		int NO_IN_DOZEN = 12;
		
		System.out.println("How many eggs do you have? ");
		Scanner enter = new Scanner(System.in);
		int eggs = enter.nextInt();
		System.out.println("You have " + eggs + " eggs.");
		System.out.println("This is a total of " + (eggs / NO_IN_DOZEN) + " dozen eggs and " + (eggs % NO_IN_DOZEN) + " single eggs.");
		System.out.println("This will cost you " + ((eggs / NO_IN_DOZEN) * DOZEN_EGGS) + ".");
		System.out.println("The single eggs will cost you " + ((eggs % NO_IN_DOZEN) * SINGLE_EGG) + ".");
		System.out.println("The total cost for all eggs is " + (((eggs % NO_IN_DOZEN) * SINGLE_EGG) + ((eggs / NO_IN_DOZEN) * DOZEN_EGGS)));
				
	}

}
