package GettersSetters;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee test = new Employee("Aqeel");

		test.setAge(36);
		test.getAge();
		
		test.setdesignation("CEO");
		test.getdesignation();
		

		test.setsalery("$8000");
		test.getsalery();
	}

}
