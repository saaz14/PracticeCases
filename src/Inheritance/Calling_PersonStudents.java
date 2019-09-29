package Inheritance;

public class Calling_PersonStudents {

	public static void main(String[] args) {

		Students calling = new Students("Imran", 32);
	
		
		calling.display();
		
		System.out.println("----------------------------------");
		
		Students student3 = new Students();
		int move = student3.move();
		System.out.println("Moving at: " + move + " miles/hour");
		
		
	}

}
