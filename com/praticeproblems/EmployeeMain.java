package com.bridgelabz.com.praticeproblems;

import java.util.Scanner;


public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeMain emp = new EmployeeMain();
		emp.getDetails();
		
	}
	
	
	public  Employee getDetails() {
		
		Employee employee = Employee.getInstance();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Employee id:");
		String emp_Id = input.next();
		employee.setEmp_Id(emp_Id);
		System.out.println("Enter the Employee Name:");
		String emp_Name = input.next();
		employee.setEmp_Name(emp_Name);
		System.out.println("Enter the data of joining");
		String date = input.next();
		employee.setDateOfJoin(date);
		System.out.println(employee);
		
		return employee;
		
		
	}




}
