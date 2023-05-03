/**
 * 
 */
package com.bridgelabz.com.praticeproblems;

/**
 * @author admin
 *
 */
public class Employee {
	
	static String emp_Id;
	static String emp_Name;
	static String dateOfJoin;
	
	
	
	 
	@Override
	public String toString() {
		return "Employee [emp_Id=" + emp_Id + ", emp_Name=" + emp_Name + ", dateOfJoin=" + dateOfJoin + "]";
	}

	public static String getEmp_Id() {
		return emp_Id;
	}

	public static void setEmp_Id(String emp_Id) {
		Employee.emp_Id = emp_Id;
	}

	public static String getEmp_Name() {
		return emp_Name;
	}

	public static void setEmp_Name(String emp_Name) {
		Employee.emp_Name = emp_Name;
	}

	public static String getDateOfJoin() {
		return dateOfJoin;
	}

	public static void setDateOfJoin(String dateOfJoin) {
		Employee.dateOfJoin = dateOfJoin;
	}

	private Employee(String emp_Id, String emp_Name, String dateOfJoin) {
		super();
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.dateOfJoin = dateOfJoin;
	}
	
	private Employee() {
		
	}
	
	
	// Early Instantation 
	private static Employee employee =  new Employee() ; 
	
	
	public static Employee getInstance() {
		
		
		return employee;
	}
	
	
	
	

}
