package excersises;

import java.util.Scanner;

public class AscendingAndDescending 
{

	public static void main(String[] args) 
	{
		int num1, num2, num3;
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("What's your first number? >> ");
		num1 = input.nextInt();
		System.out.println("What's your second number? >> ");
		num2 = input.nextInt();
		System.out.println("What's your third number? >> ");
		num3 = input.nextInt();
		
			if(num1> num2 & num1 >num3)
			{
				if(num2>num3)
				{
					System.out.println(num1+ " > " + num2 + " > " + num3);
				}
				else if(num3>num2)
				{
						System.out.println(num1+ " > "+ num3 + " > " + num2 );
				}
			}
			
		
			if(num2>num1 & num2>num3)
			{
					
				if(num1>num3)
				{
						System.out.println(num1+ " > " + num3);	
				}		
					else if(num3>num1)
				{
						System.out.println(num3+ " > " + num1);	
				}
			}
		
			if(num3>num1 & num3>num2);	
			{
				if(num1>num2)
				{
						System.out.println(num1+ " > " + num2);	
				}
					else if(num2>num1)
				{
						System.out.println(num2+ " > " + num1);	
				}
					
				
				
			}

	}
}
