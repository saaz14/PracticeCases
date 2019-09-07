package Constructors;

public class Employee {
	int employeeAge;
	String employeedesignation;
	String employeesalery;
	
	String name;
	int age;
	String designation;
	String salery;
	
	public Employee(String name) {
		this.name = name;
		System.out.println("Name of Employee is: " + name);
	}
	
	public void setAge(int age) {
		this.employeeAge = age;
	}
	
	public int getAge() { 
		System.out.println("Employee's age is: " + employeeAge);
		return employeeAge;
	}
	
	public void setdesignation(String designation) {
		employeedesignation = designation;
	}
	
	public String getdesignation() { 
		System.out.println("Employee's Designation is: " + employeedesignation);
		return employeedesignation;
	}
	
	public void setsalery(String salery) {
		employeesalery = salery;
	}
	
	public String getsalery() { 
		System.out.println("Employee's Salery is: " + employeesalery);
		return employeesalery;
	}

}
