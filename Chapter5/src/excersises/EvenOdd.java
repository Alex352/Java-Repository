package excersises;
import javax.swing.JOptionPane;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numStr, result;
	      int num, choice;

	      do 
	      {
	         numStr = JOptionPane.showInputDialog ("Enter an integer: ");

	         num = Integer.parseInt(numStr);

	         result = "That number is " + ((num%2 == 0) ? "even" : "odd");

	         JOptionPane.showMessageDialog (null, result);

	         choice = JOptionPane.showConfirmDialog (null, "Do Another?");
	      }
	      while (choice == JOptionPane.YES_OPTION);
	}

}
