package examples;
import java.util.Scanner;
public class ArithmaticDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double firstNumber; 
		double secondNumber; 
		double sum;
		double difference; 
		double average; 
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a double >> ");
		firstNumber = input.nextInt();
		System.out.print("Please enter another double >> ");
		secondNumber = input.nextInt(); 
		
		sum = firstNumber + secondNumber;
		difference = firstNumber - secondNumber; 
		average = sum / 2;
		
		System.out.println(firstNumber + "+" + secondNumber + " is " + sum);
		System.out.println(firstNumber + "-" + secondNumber + " is " + difference);
		System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
		

	}

}
