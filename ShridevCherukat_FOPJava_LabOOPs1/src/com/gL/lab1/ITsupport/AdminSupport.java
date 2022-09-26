package com.gL.lab1.ITsupport;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import com.gL.lab1.Employee.Employee;

public class AdminSupport {
	
/* Creating object of class EmployeeService to 
	use the implementation written in that class
*/
	
	private static EmployeeService employeeService = new EmployeeService();
	
	public static void main(String[] args) {
		
// Driver class
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter First Name: ");
		String firstName= input.next();
		System.out.println("Please enter Last Name: ");
		String lastName= input.next();
		System.out.println("Please enter date of birth in dd/mm/yyyy format: ");
		String strDOB = input.next();
		LocalDate dob = null;
		Employee newHire = null;
		
// Handling the exception for when wrong format of Date of birth typed
		
		try {
			DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			dob = LocalDate.parse(strDOB, pattern);
		} catch (Exception exception) {
			System.out.println("Invalid date format passed. Example: 18/03/1977");
		}

		if (dob != null) {
			newHire = new Employee(firstName, lastName, dob);
		} else {
			newHire = new Employee(firstName, lastName);
		}
// Calling the methods required in order to generate the desired output
		
		newHire.DetermineDepartment();
		employeeService.generateEmailAddress(newHire);
		employeeService.saveCredentials(8, newHire);
		employeeService.printEmployeeDetails(newHire);
		input.close();
	}
}


