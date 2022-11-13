package help;

import java.util.Scanner; 

public class CalculateSalary {
	public static void main(String[] args) {
		int sum = 1000; 
		final double FLAT_TAX_RATE = 0.7;
		PaymentSlip employeeSlip = new PaymentSlip();
		
		Scanner myScanner = new Scanner(System.in); 
		
		System.out.println("What is the employee's name?");
		String name = myScanner.nextLine();
		
		System.out.println("What is their hourly rate?");
		int hourlyRate = myScanner.nextInt();
		
		System.out.println("How many hours did they work this month?");
		int hours = myScanner.nextInt();
		
		//System.out.println(name + hourlyRate + hours);
		employeeSlip.setName(name);
		employeeSlip.setHourlyRate(hourlyRate);
		employeeSlip.setHours(hours);
		
		String tableBorders = "--------------------\n";
		String tableHeaders = "## PAYMENT INFORMATION ##\r\n";
		
		String row1 = "Name:\t\t\t" + employeeSlip.getName() + "\n";
		String row2 = "Hourly rate:\t\t" + employeeSlip.getHourlyRate() + "\n";
		String row3 = "Hours worked:\t\t" + employeeSlip.getHours() + "\n";
		String row4 = "Salary before tax:\tHelgonavägen 2\n";
		String row5 = "Salary after tax:\tHelgonavägen 2\n";
		
		String rows = row1 + row2 + row3 + "\n" + row4 + row5;
		
		String output = tableBorders + tableHeaders + rows;
		output += "\nIf you have any questions regarding your salary, contact Bob\n";
		output += tableBorders; 
		
		System.out.println(output);
		
		//double test = sum * FLAT_TAX_RATE;
		
		//System.out.println(test);
	}
}