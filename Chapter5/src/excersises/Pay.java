package excersises;

import javax.swing.JOptionPane;

public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String skillLevelString;
		int skillLevelInt, insuranceLevelInt;
		double hoursWorkedDouble;
		double totalGrossPay;
		double totalNetPay;
		String insuranceLevelString;
		String hoursWorkedString;
		String retirementString;
		skillLevelString = JOptionPane.showInputDialog(null, "What skill level are you 1, 2, or 3?");
		skillLevelInt = Integer.parseInt(skillLevelString);
		
		if(skillLevelInt == 1)
		{
			insuranceLevelString = JOptionPane.showInputDialog(null, "What insurance do you have 1, 2, or 3?");
			insuranceLevelInt = Integer.parseInt(insuranceLevelString);
			if(insuranceLevelInt == 1)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours during the week did you work?");
				hoursWorkedDouble = Double.parseDouble(hoursWorkedString);
				totalGrossPay = 17 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 32.50;
				JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is " + totalGrossPay + 
				" subrtracting insurance for level 1 " + "making your total net pay equal " + totalNetPay);
			}
			if(insuranceLevelInt == 2)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours during the week did you work?");
				hoursWorkedDouble = Double.parseDouble(hoursWorkedString);
				totalGrossPay = 17 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 20;
				JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is " + totalGrossPay + 
				" subrtracting insurance for level 1 " + "making your total net pay equal " + totalNetPay);
			}
			if(insuranceLevelInt == 3)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours during the week did you work?");
				hoursWorkedDouble = Double.parseDouble(hoursWorkedString);
				totalGrossPay = 17 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 10;
				JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is " + totalGrossPay + 
				" subrtracting insurance for level 1 " + "making your total net pay equal " + totalNetPay);
				
				String retirementString1 = JOptionPane.showInputDialog(null, "3% retirement Option Yes or No?");
				Object retirmentString = null;
				if(retirmentString.equals("Yes"));
				{
					//Calculate retirement pay here
					//3% of gross pay
					//netPay = grossPay * 0.03;
					//JoptionPane your total net pay after retirement is x
					
				}
				if(retirementString.equals("No"));{
			}
		}
		
		
	}

}
