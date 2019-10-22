package pnt.hr.payroll;

import java.util.Scanner;

import pnt.hrcalculator.CalculatorV5;

public class DriverMark {

	public static void main(String[] args) {
		CalculatorV5 MarksCalculator=new CalculatorV5();
		
		MarksCalculator.wellcome();
		
		
		
		for(int i=0; i<3; i++) {  
			
			System.out.println("Employee : " + (i+1)+ "******" );
			
			MarksCalculator.getInput();
			MarksCalculator.calculatSalary();
			MarksCalculator.displayOutput();
		  
			if(!MarksCalculator.doYouWantToContinue()) {
				break;
			}
		}
		   MarksCalculator.exitPrograme();
		}
}