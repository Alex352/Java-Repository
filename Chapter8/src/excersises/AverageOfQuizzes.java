package excersises;
import java.util.Scanner;
public class AverageOfQuizzes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int[10];
		int score = 0;
		int count = 0;
		int total = 0;
		final int QUIT = 999;
		final int MAX = 10;
		int highest = 0;
		int lowest = 100;
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter quiz score or " + QUIT + " to quit >>>>>");
		
		score = input.nextInt();
		while(score != QUIT)
		{
			scores[count] = score;
			total = total + scores[count];
			count = count + 1;
			if(highest <= score)
				highest = score;
			if(count == MAX){
				score = QUIT;
			}
			else
			{
				System.out.println("Enter next quiz score or " + QUIT + " to quit >>>>");
				score = input.nextInt();
			}
		}
		System.out.println("\nThe scores entered were: ");
		for(int x = 0; x < count; x =x +1)
		{	
			System.out.println(scores[x] + " ");
		}
		if(count!= 0)
		{
			System.out.println("\nThe average is " + (total * 1.0/ count));
		}
		else
			System.out.println("No scores were entered");
		{	
}
	}
}