package delgadoTacos;
import java.util.Scanner;
public class DelgadosTacos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		menu();
	
		
	}
	public static void menu()
	{
		double tacoPrice = .99;
		double burritoPrice = 5.99;
		double enchaladaPrice = 7.99;
		double waterPrice = .75;
		double cevichePrice = 8.99;
		double popPrice = 1.99;
		double ricePrice = 4.99;
		double saladPrice = 6.99;
		double nachosPrice = 2.99;
		double lasagnaPrice = 19.99;
		
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
		
		Scanner inputDevice = new Scanner(System.in);
		
		
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
		
		double totalPrice = (tacoPrice * tacoOrdered) + (burritoOrdered * burritoPrice) + (enchaladaOrdered * enchaladaPrice) 
				+ (waterOrdered * waterPrice) + (cevicheOrdered * cevichePrice) 
				+ (popOrdered * popPrice) + (riceOrdered * ricePrice) 
				+ (saladOrdered * saladPrice) + (nachosOrdered * nachosPrice) 
				+ (lasagnaOrdered * lasagnaPrice);
		
		System.out.println("You ordered " + tacoOrdered + " Tacos, " + burritoOrdered + " burritos, " + enchaladaOrdered + 
				" enchaladas, " + waterOrdered + " waters, " + cevicheOrdered + " ceviches, " + popOrdered + 
				" pops, " + riceOrdered + " pounds of rice, " + saladOrdered + " salads, " + nachosOrdered + 
				" nachos, and " + lasagnaOrdered + " lasagnas, for a total price of " + totalPrice);
				
		
		
	}

}
