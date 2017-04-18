package gameZone;
import java.util.Scanner;
public class DoorChoice {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	int choice, choice2;
	int door1 =1;
	int door2 =2;
	int door3 =3;
	Scanner input = new Scanner(System.in);
		do{
		System.out.println("Please choose a door 1,2, or 3");
		choice = input.nextInt();
			if(choice == door1)
			{
				System.out.println("You chose door 1, congratulations you won MOLDY CHEESE!");
			}
			if(choice == door2)
			{
				System.out.println("You chose door 2, congratulations you won a NEW CAR!");
			}
			if(choice == door3)
			{
				System.out.println("You chose door 3, congratulations you won a TACO!");
			}
			System.out.println("would you like to play again? 1 for yes 2 for no");
			choice2 = input.nextInt();
		}while(choice2 == 1);
	}
}