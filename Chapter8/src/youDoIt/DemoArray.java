package youDoIt;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[]employeeNames = {"John", "Bob", "Tina", "AshLynn"};
		double[]salaries = {6.25, 6.55, 10.25, 16.85};
		System.out.println("Salaries one by one are: ");
		for(int i =0; i < 4; i = i +1)
		{
			
			System.out.println("Name: "+ employeeNames[i] + " " + salaries[i]);
		}
		
		
	}

}
