package excercises;

import java.util.Scanner;

public class NauticalMilesInteractive {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double kilometers = 1.852;
		double nauticalMiles = 1.150779;
		int mileInput;
		double totalKilo, totalNM;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please the number of miles >> ");
		mileInput = input.nextInt();
		
		totalKilo = mileInput * kilometers; 
		totalNM = 	mileInput * nauticalMiles;

		System.out.print(kilometers * mileInput " );
	}

}
