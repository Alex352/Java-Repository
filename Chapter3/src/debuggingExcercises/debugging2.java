package debuggingExcercises;

public class debugging2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 2;
		double b = 5; 
		double c = 10;
	     	add(a, b);
	     	add(b, c);
	     	subtract(c, a);            
	   }
	   public static void add(double b, double  c)
	   {
	      System.out.println("The sum of " + b +
	         " and " + c + " is " + (b + c));
	   }
	   public static void subtract(double c, double a)
	   {
	      System.out.println("The difference between " +
	        c + " and " + a + " is " +  (c - a));
	}

}
