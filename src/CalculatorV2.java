import java.util.Scanner;

public class CalculatorV2 {

	static String nameOfEmployee;
	static double numberOfHourWorked;
    static double hourlyPayRat;
	static	double grossPay;
		

	
public static void wellcome() {
	System.out.println("wellcom to EMP cal- please follow the instruction");
    System.out.println();
    System.out.println();
}

public static void getInput() {
	
	Scanner hrscan = new Scanner(System.in);
     
     System.out.println("Enter Employee Name");
     nameOfEmployee = hrscan.nextLine();
     
     System.out.println("Enter Employee Total Hour");
     numberOfHourWorked = hrscan.nextDouble();
     
     System.out.println("Enter hourly Pay Rate");
     hourlyPayRat = hrscan.nextDouble();
}


public static void calculateGrossePay() {
	
	 grossPay=numberOfHourWorked*hourlyPayRat;
	 
	
}


public static void displayOutput() {
	
	 System.out.println();
	 System.out.println("=======================");
	 System.out.println("Employee Name");
	 System.out.println("Employee Total is: " +numberOfHourWorked);
	 System.out.println("Employee Hourly Rate is:" + hourlyPayRat);
	 System.out.println("Employee Gross  is: " +grossPay);
	 System.out.println("======================");
}


public static void exitPrograme() {
	System.out.println();
	System.out.println();
	System.out.println("thank you for comming, have a nice day");
}
	
	
public static void main(String[] args) {

	
	wellcome ();
	getInput ();
	calculateGrossePay();
	displayOutput ();
	exitPrograme ();
	
	
	
	
}
}


