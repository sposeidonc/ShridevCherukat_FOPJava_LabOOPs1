package com.gL.lab1.Employee;

import java.time.LocalDate;
import java.util.Scanner;

public class Employee {
	
// Initializing private variables for Employee Information
	
	private String firstName, lastName, department, password, emailAddress;
	private LocalDate dateOfBirth;
	
//Creating 2 parameterized Constructors, One with Date of birth and one without.
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Employee(String firstName, String lastName, LocalDate dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
// Getter and setter methods for the above mentioned Employee Information attributes
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getLastName() {
		return lastName;
	}
	public String getDepartment() {
		return department;
	}
	Scanner input = new Scanner(System.in);
	
// Method to determine Employee Department
	
	public void DetermineDepartment() {
		int temp = 0;
		int option = 0;
		while (temp == 0) {
			System.out.println("Please select your department from the "
					+ "following (Please only provide the option number): ");
			System.out.println("1) Technical ");
			System.out.println("2) Admin ");
			System.out.println("3) Human Resource ");
			System.out.println("4) Legal ");
			option = input.nextInt();
			if (option == 1 || option == 2 || option == 3 || option == 4) {
				temp = 1;
			}
			else {
				System.out.println("!!!!Please enter a valid option!!!!");
			}
		}
		if (option == 1)
			setDepartment("tech");
		else if (option == 2) 
			setDepartment("admin");
		else if (option == 3) 
			setDepartment("hr");
		else if (option == 4) 
			setDepartment("legal");	
	}
}