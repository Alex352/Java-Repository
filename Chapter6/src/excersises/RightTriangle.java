package excersises;

import java.util.Scanner;

public class RightTriangle {
	
	private static Scanner input;
	public static void main(String[] args) 
	{
		
		
		
		input = new Scanner(System.in);
		System.out.println("Which side do you want to solve? A, B, C");
		String choice = input.nextLine();
		
		if("A".equals(choice))
		{
			sideA();
		}
		if("B".equals(choice))
		{
			sideB();
		}
		if("C".equals(choice))
		{
			sideC();
		}
	}
	public static void sideA()
	{
		double sideA = 0, sideB = 0, sideC = 0;
		double result;
		System.out.println("c");
		sideC = input.nextInt();
		System.out.println("b");
		sideB = input.nextInt();
		result = Math.sqrt(sideC * sideC - sideB * sideB);
		System.out.println("The answer is " + result);
	}
	public static void sideB()
	{
		double sideA = 0, sideB = 0, sideC = 0;
		double result;
		System.out.println("c");
		sideC = input.nextInt();
		System.out.println("a");
		sideA = input.nextInt();
		result = Math.sqrt(sideC * sideC - sideA * sideA);
		System.out.println("The answer is " + result);
	}
	public static void sideC()
	{
		double sideA = 0, sideB = 0, sideC = 0;
		double result;
		System.out.println("a");
		sideA = input.nextInt();
		System.out.println("b");
		sideB = input.nextInt();
		result = Math.sqrt(sideA * sideA + sideB * sideB);
		System.out.println("The answer is " + result);
	}
}
