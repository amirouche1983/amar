package pnt.hrcalculator;

import java.util.Scanner;
public class CalculatorV5 {

	static String nameOfEmployee;
	static double numberOfHourWorked;
    static double hourlyPayRat;
	static double grossPay;
	static double netPay;

	
 public static void wellcome() {
	System.out.println("wellcom to EMP cal- please follow the instruction");
    System.out.println();
    System.out.println();
}

public static void getInput() {
	Scanner hrscan = new Scanner(System.in);
    System.out.println("Enter Employee Name");
   nameOfEmployee = hrscan.nextLine();
 
   boolean continueToNextStep;
    do {
  	 try {
  		 hrscan =  new Scanner(System.in);
  		   System.out.println("Enter Employee Total Hour");
  		     numberOfHourWorked = hrscan.nextDouble();
  		    
  		     if(numberOfHourWorked>=0 && numberOfHourWorked<=80) {
  		    	 continueToNextStep = true;
  		     
  		     }else {
  		    	 System.out.println("please Enter Hour Between 0-80");
  		    	 continueToNextStep = false;
  		    	 }
  		     
  		     } catch (Exception e) {
  		    	 System.out.println("Exception please enter a number between 0-80");
  		    	 continueToNextStep = false;
  		     }
  		     }while(! continueToNextStep);
          
  		     
    
    
  		     
  		     
  		     do {
  		     try {
  		    		 hrscan =new Scanner(System.in);
  		    		   System.out.println("Enter hourly Pay Rate");
  		    		   hourlyPayRat  = hrscan.nextDouble();
  		    		     if(hourlyPayRat >=10 &&hourlyPayRat <=50) {
  		    		    	 continueToNextStep = true;
  		    		     }else {
  		    		    	 System.out.println("please Enter Pay Rat Between 10-50");
  		    		    	 continueToNextStep = false;  
  		    		     }
  		    	 } catch (Exception e) {
  		    		    	 System.out.println("Exception please enter a number between 10-50");
  		    		    	 continueToNextStep = false;
  		    	                    
  		    	 }
  		     } while(! continueToNextStep);
}


           

          
public static void calculatSalary() {
	                calculateGrossePay();
	                calculatNetPay();
	                }

public static void calculateGrossePay() {
	
	 grossPay=numberOfHourWorked*hourlyPayRat;
	 
	
}

public static void calculatNetPay() {
	if (grossPay>0 && grossPay<=1500) {
		netPay= grossPay-(grossPay*15)/100;
		 
	} else if(grossPay>1500 && grossPay<=3000) {
		netPay=grossPay-(grossPay*19)/100;
		
	}else if(grossPay>3000 && grossPay<=4500) {
		netPay=grossPay-(grossPay*21)/100;
	
}else if(grossPay>4500 && grossPay<=6000) {
	netPay=grossPay-(grossPay*23)/100;
	
}else if (grossPay>600) {
	netPay=grossPay-(grossPay*27)/100;
}
else {
	netPay=0;
	System.out.print("invalid Input Captured!!!");
}
	}
public static void displayOutput() {
	
	 System.out.println();
	 System.out.println("=======================");
	 
	 System.out.println("Employee Name");
	 System.out.println("Employee Total is: " +numberOfHourWorked);
	 System.out.println("Employee Hourly Rate is:" + hourlyPayRat);
	 System.out.println("Employee Gross  is: " +grossPay);
	 System.out.println("Employee netPay is:" +netPay);
	 
	 System.out.println("======================");
}


public static void exitPrograme() {
	System.out.println();
	System.out.println();
	System.out.println("thank you for comming, have a nice day");
}
public static boolean doYouWantToContinue() {
	
	String doYouWantToContinue;
	
	
	Scanner choiceScanner = new Scanner(System.in);
	 

	System.out.println("do you want to continue....");

	doYouWantToContinue = choiceScanner.nextLine();
  
	if(doYouWantToContinue.equals("yes")) {
		return true;
	}
		 
		  return false;
	
}
	
	
 public static void main(String[] args) {

	
	  
	
	
	
}
}


