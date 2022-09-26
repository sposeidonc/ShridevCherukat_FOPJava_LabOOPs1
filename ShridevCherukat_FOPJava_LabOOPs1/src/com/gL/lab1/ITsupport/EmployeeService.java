package com.gL.lab1.ITsupport;

import com.gL.lab1.CredentialService.CredentialService;
import com.gL.lab1.Employee.Employee;

public class EmployeeService {

// This class delegates the logic to the CredentialService class

	public void generateEmailAddress(Employee employee) {
		String emailAddress = CredentialService.generateEmailAddress(employee.getFirstName(), 
				employee.getLastName(), employee.getDepartment());
		employee.setEmailAddress(emailAddress);
	}
	
	public Employee saveCredentials(int length, Employee employee) {
		String password = CredentialService.generatePassword(length);
		employee.setPassword(password);
		return employee;
	}
	
	public void printEmployeeDetails(Employee employee) {
		CredentialService.showCredentials(employee);
	}

}

