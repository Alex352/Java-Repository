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
		
		
		
		menu();
		Ordermenu();
		salesTax(totalPrice);
		
	}
	public static void Ordermenu()
	{
		
		
		int tacoOrdered;  
		int burritoOrdered;
		int enchaladaOrdered;
		int waterOrdered;
		int cevicheOrdered;
		int popOrdered;
		int riceOrdered;
		int saladOrdered;
		int nachosOrdered;
		int lasagnaOrdered;
		
		inputDevice = new Scanner(System.in);
		
		
		System.out.println("How many tacos do you want? >>>> ");
		tacoOrdered = inputDevice.nextInt();
		inputDevice.nextLine();
		
		System.out.println("How many burritos do you want? >>>> ");
		burritoOrdered = inputDevice.nextInt();
		inputDevice.nextLine();
		
		System.out.println("How many enchaladas do you want? >>>> ");
		enchaladaOrdered = inputDevice.nextInt();
		inputDevice.nextLine();
		
		System.out.println("How many waters do you want? >>>> ");
		waterOrdered = inputDevice.nextInt();
		inputDevice.nextLine();
		
		System.out.println("How many ceviches do you want? >>>> ");
		cevicheOrdered = inputDevice.nextInt();
		inputDevice.nextLine();
		
		System.out.println("How many pops do you want? >>>> ");
		popOrdered = inputDevice.nextInt();
		inputDevice.nextLine();
		
		System.out.println("How much rice do you want? >>>> ");
		riceOrdered = inputDevice.nextInt();
		inputDevice.nextLine();
		
		System.out.println("How many salads do you want? >>>> ");
		saladOrdered = inputDevice.nextInt();
		inputDevice.nextLine();
		
		System.out.println("How many nachos do you want? >>>> ");
		nachosOrdered = inputDevice.nextInt();
		inputDevice.nextLine(); 
		
		System.out.println("How much lasagna do you want? >>>> ");
		lasagnaOrdered = inputDevice.nextInt();
		inputDevice.nextLine();
		
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