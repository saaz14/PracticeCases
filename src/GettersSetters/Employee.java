package GettersSetters;

public class Employee {
	
	
	String name;
	int age;
	String designation;
	String salery;
	
	
	public Employee(String name) {
		this.name = name;
		System.out.println("Name of Employee is: " + name);
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() { 
		System.out.println("Employee's age is: " + age);
		return age;
	}
	
	public void setdesignation(String designation) {
		this.designation = designation;
	}
	
	public String getdesignation() { 
		System.out.println("Employee's Designation is: " + designation);
		return designation;
	}
	
	public void setsalery(String salery) {
		this.salery = salery;
	}
	
	public String getsalery() { 
		System.out.println("Employee's Salery is: " + salery);
		return salery;
	}

}
