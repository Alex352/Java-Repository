package delgadoTacos;
import java.util.Scanner;

public class DelgadosTacos {
	static double tacoPrice = .99;
	static double burritoPrice = 5.99;
	static double enchaladaPrice = 7.99;
	static double waterPrice = .75;
	static double cevichePrice = 8.99;
	static double popPrice = 1.99;
	static double ricePrice = 4.99;
	static double saladPrice = 6.99;
	static double nachosPrice = 2.99;
	static double lasagnaPrice = 19.99;
	static double totalPrice;
	private static Scanner inputDevice;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choiceYes = null;
		
		
		menu();
		do{
		Ordermenu();
		System.out.println("Would you like anything else? Yes or No >>>>");
		choiceYes = inputDevice.nextLine();
		}while(choiceYes.equals("Yes"));
		salesTax(totalPrice);
		
	}
	public static void Ordermenu()
	{
		
		String choice;
		int tacoOrdered =0;  
		int burritoOrdered =0;
		int enchaladaOrdered =0;
		int waterOrdered =0;
		int cevicheOrdered =0;
		int popOrdered =0;
		int riceOrdered =0;
		int nachosOrdered = 0;
		int saladOrdered =0;
		int lasagnaOrdered =0;
		int menuOrder;
	
		inputDevice = new Scanner(System.in);
		
		System.out.print("From the menu, which item would you like to order?>>>>>");
		menuOrder = inputDevice.nextInt();
		
				if(menuOrder == 1)
				{
				System.out.println("How many tacos do you want? >>>> ");
				tacoOrdered = inputDevice.nextInt();
				inputDevice.nextLine();
				}
				if(menuOrder == 2)
				{
				System.out.println("How many burritos do you want? >>>> ");
				burritoOrdered = inputDevice.nextInt();
				inputDevice.nextLine();
				}
				if(menuOrder == 3)
				{
				System.out.println("How many enchaladas do you want? >>>> ");
				enchaladaOrdered = inputDevice.nextInt();
				inputDevice.nextLine();
				}
				if(menuOrder == 4)	
				{
				System.out.println("How many waters do you want? >>>> ");
				waterOrdered = inputDevice.nextInt();
				inputDevice.nextLine();
				}
				if(menuOrder == 5)
				{
				System.out.println("How many ceviches do you want? >>>> ");
				cevicheOrdered = inputDevice.nextInt();
				inputDevice.nextLine();
				}
				if(menuOrder == 6)	
				{
				System.out.println("How many pops do you want? >>>> ");
				popOrdered = inputDevice.nextInt();
				inputDevice.nextLine();
				}
				if(menuOrder == 7)
				{
				System.out.println("How much rice do you want? >>>> ");
				riceOrdered = inputDevice.nextInt();
				inputDevice.nextLine();
				}
				if(menuOrder == 8)
				{
				System.out.println("How many salads do you want? >>>> ");
				saladOrdered = inputDevice.nextInt();
				inputDevice.nextLine();
				}
				if(menuOrder == 9)
				{	
				System.out.println("How many nachos do you want? >>>> ");
				nachosOrdered = inputDevice.nextInt();
				inputDevice.nextLine(); 
				}
				if(menuOrder == 10)
				{
				System.out.println("How much lasagna do you want? >>>> ");
				lasagnaOrdered = inputDevice.nextInt();
				inputDevice.nextLine();
				}
		
		totalPrice = (tacoPrice * tacoOrdered) + (burritoOrdered * burritoPrice) + (enchaladaOrdered * enchaladaPrice) 
				+ (waterOrdered * waterPrice) + (cevicheOrdered * cevichePrice) 
				+ (popOrdered * popPrice) + (riceOrdered * ricePrice) 
				+ (saladOrdered * saladPrice) + (nachosOrdered * nachosPrice) 
				+ (lasagnaOrdered * lasagnaPrice);
		
		System.out.println("You ordered " + tacoOrdered + " Tacos, " + burritoOrdered + " burritos, " + enchaladaOrdered + 
				" enchaladas, " + waterOrdered + " waters, " + cevicheOrdered + " ceviches, " + popOrdered + 
				" pops, " + riceOrdered + " pounds of rice, " + saladOrdered + " salads, " + nachosOrdered + 
				" nachos, and " + lasagnaOrdered + " lasagnas, for a total price of " + totalPrice);
				
		
		
	}
	
	public static void salesTax(double totalPrice)
	{
		double withTax;
		double salesTax = 1.075;
		withTax = salesTax * totalPrice;
		System.out.println("Your total with tax is " + withTax);
	}
	public static void menu()
	{
		System.out.println("**********************************");
		System.out.println("*Tacos = " + tacoPrice);
		System.out.println("*Burritos = " + burritoPrice);
		System.out.println("*Enchalada = " + enchaladaPrice);
		System.out.println("*Water = " + waterPrice);
		System.out.println("*Ceviche = " + cevichePrice);
		System.out.println("*Pop = " + popPrice);
		System.out.println("*Rice = " + ricePrice);
		System.out.println("*Salad = " + saladPrice);
		System.out.println("*Nachos = " + nachosPrice);
		System.out.println("*Lasagna = " + lasagnaPrice);
		System.out.println("**********************************");
	}

}
