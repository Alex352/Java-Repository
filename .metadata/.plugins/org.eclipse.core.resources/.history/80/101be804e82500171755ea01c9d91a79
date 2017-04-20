package excersises;
import java.util.Scanner;
public class PizzaChoice {

	public static void main(String[] args) 
	{// TODO Auto-generated method stub
		String choice; 
		int choice2;
		int toppingChoice;
		double large = 10.99;
		double medium = 7.99;
		double small = 4.99;
		
		Scanner input = new Scanner(System.in);
		do{
		System.out.println("Would you like a pizza? Yes or No>>>>>>");
		choice = input.nextLine();
		
			if("Yes".equals(choice) ||"yes".equals(choice)||"Y".equals(choice)||"y".equals(choice) );
			{
					System.out.println("You said " + choice + " to eating pizza");
					System.out.println("Please choose a topping 1 for Hamburger, 2 for Peperoni, or 3 for Canadian Bacon");
					toppingChoice = input.nextInt();
					if(toppingChoice == 1)
					{
							System.out.println("You want hamburger pizza, what size do you want? 1 Small, 2 Medium, or 3 Large?");
							choice2 = input.nextInt();
							if(choice2 == 1)
							{
									System.out.println("You chose a small pizza that will be " + small + ".");
							}
							if(choice2 == 2)
							{
									System.out.println("You chose a medium pizza that will be " + medium + ".");
							}
							if(choice2 == 3)
							{
									System.out.println("You chose a large pizza that will be " + large + ".");
							}
					}
					if(toppingChoice == 2)
					{
							System.out.println("You want peperoni pizza, what size do you want? Small, Medium, or Large?");
					}
					if(toppingChoice == 3)
					{
							System.out.println("You want canadian bacon pizza, what size do you want? Small, Medium, or Large?");
					}
					if(toppingChoice >= 4)
					{
						System.out.println("I am sorry, we do not have that topping.");
					}
		}
	}while();
}
