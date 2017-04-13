package debuggingExcercises;

public class debugging4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int myCredits = 13;
	      int yourCredits = 17;
	      double rate = 75.84;
	      System.out.println("My tuition:");
	      tuitionBill(myCredits, rate);
	      System.out.println("Your tuition:");
	      tuitionBill(yourCredits, rate);
	   }
	   public static void tuitionBill(int c, double r)
	   {
	      System.out.println("Total due " + (c*r));
	}

}
