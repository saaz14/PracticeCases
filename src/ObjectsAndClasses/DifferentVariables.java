package ObjectsAndClasses;

public class DifferentVariables {
	
	//Instance Variables (Within a class but outside any method. These variables are initialized when the class is instantiated. Can be accessed from inside any method, constructor or blocks of that particular class)
	String sex;
	int age;
	String Group;
	
	//Class Variable (Declared within a class, outside any method, with the static keyword)
	static double Height;
	
	static void Grade1() {
		//Local Variable (Defined inside methods, constructors or blocks. Declared and initialized within the method and the variable will be destroyed when the method is complete)
		int age = 25;
		Height = 5.11; //Since this variable was static, we don't have to define the keyword before the name
		System.out.println(age);
		System.out.println(Height);
	} 
	

	public static void main(String[] args) {

		Grade1();
		
		
		DifferentVariables xyz = new DifferentVariables();
		xyz.sex = "Male";
		System.out.println(xyz.sex);
		
	}

}
