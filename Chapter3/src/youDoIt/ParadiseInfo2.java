package youDoIt;
import java.util.Scanner;
public class ParadiseInfo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double price;
		 double discount;
		 double savings = 0;
		   Scanner keyboard = new Scanner(System.in);
		      System.out.print("Enter cutoff price for discount >>");
		      price = keyboard.nextDouble();

		      System.out.print("Enter discount rates as a whole number >> ");
		      discount = keyboard.nextDouble();
		      System.out.println("Special this week on any service over " +
		         price);
		      System.out.println("Discount of " + discount + " percent");
		      System.out.println("That's a savings of at least $" + savings);

		   displayInfo();
		   savings = computeDiscountInfo(price, discount);
		   }
		   public static void displayInfo()
		   {
		      System.out.println("Paradise Day Spa wants to pamper you.");
		      System.out.println("We will make you look good.");
		   }
		public static double computeDiscountInfo(double pr, double dscnt)
		   {
		   double savings;
		   savings = pr * dscnt / 100;
		   return savings;

		   }
		}
	


