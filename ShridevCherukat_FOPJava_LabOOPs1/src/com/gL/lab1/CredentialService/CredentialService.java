package com.gL.lab1.CredentialService;

import java.util.Random;
import com.gL.lab1.Employee.Employee;

public class CredentialService {
	
//Setting the final variables 
	
	private static final String DOMAIN_NAME = ".abc.com";
	private static final String DELIMITTER = "";
	
//Method to generate the Employee Password
	
	public static String generatePassword(int size) {
		
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$%^&*()_";
		String numbers = "1234567890";
		String combinedChars = capitalCaseLetters + lowerCaseLetters 
				+ specialCharacters + numbers;
		Random random = new Random();
		char[] password = new char[size];

		password[0] = lowerCaseLetters.charAt(random.nextInt
				(lowerCaseLetters.length()));
		password[1] = capitalCaseLetters.charAt(random.nextInt
				(capitalCaseLetters.length()));
		password[2] = specialCharacters.charAt(random.nextInt
				(specialCharacters.length()));
		password[3] = numbers.charAt(random.nextInt
				(numbers.length()));
		   
		for(int i = 4; i < size ; i++) {	
		    password[i] = combinedChars.charAt(random.nextInt
		    		(combinedChars.length()));
		}
		 String pwd = String.valueOf(password);

		return pwd;
	}
//Method to generate the Employee Email Address
	
	public static String generateEmailAddress
	(String firstName, String lastName, String department) {
		String emailAddress = firstName.toLowerCase()+DELIMITTER
				+lastName.toLowerCase()+"@"+department+DOMAIN_NAME;
		return emailAddress;
	}
//Method to display the Employee Information
	
	public static void showCredentials(Employee employee) {
		System.out.println("Dear "+employee.getFirstName()
		        +", your generated credentials are as follows");
		System.out.println("Email ---> "+employee.getEmailAddress());
		System.out.println("Password ---> "+employee.getPassword());	
	}
}
	

	


