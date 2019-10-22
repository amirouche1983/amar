import java.util.Scanner;

public class CalculatorV1 {

	public static void main(String[] args) {
		
		
		
		//variable Declaration 
		
		String nameOfEmployee;
		double numberOfHourWorked;
		double hourlyPayRat;
		double grossPay;
		
		
		
		
		System.out.println("wellcom to EMP cal- please follow the instruction");
		System.out.println();
		System.out.println();
		
		//taking object reference for scanning information for any input system);
         Scanner hrscan = new Scanner(System.in);
         
         System.out.println("Enter Employee Name");
         nameOfEmployee = hrscan.nextLine();
         
         System.out.println("Enter Employee Total Hour");
         numberOfHourWorked = hrscan.nextDouble();
         
         System.out.println("Enter hourly Pay Rate");
         hourlyPayRat = hrscan.nextDouble();
         
         
        
		//initialize
		
	
		 
		 //prosses
		 grossPay=numberOfHourWorked*hourlyPayRat;
		 
		 //display out put
		 System.out.println();
		 System.out.println("=======================");
		 System.out.println("Employee Name");
		 System.out.println("Employee Total is: " +numberOfHourWorked);
		 System.out.println("Employee Hourly Rate is:" + hourlyPayRat);
		 System.out.println("Employee Gross  is: " +grossPay);
		 System.out.println("======================");
	}

}
