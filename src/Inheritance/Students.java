package Inheritance;

import java.util.ArrayList;

public class Students extends Person implements Player{
	
	String name;
	int age;
	
	@Override
	void message() {
		
		System.out.println("This is Students class");
	}
	
	void display() {
		message();
		super.message();
	}
	
	Students() {
		
		super();
		System.out.println("Student class constructor");
	}
	
	Students(String name, int age) {
		super("Faizan!!!!!");
		this.name = name;
		this.age = age;
		
		System.out.println("Student name is " + name + " / " + "Age is " + age);
	}

	@Override
	public int move() {
		
		return 100;
	}

	@Override
	public ArrayList<String> someMethod(String[] arr) {

		ArrayList<String> strList = new ArrayList<>();
		
		for (int i = 0 ; i < arr.length ; i++) {
			strList.add(arr[i]);
		}
		return strList;
	}
	
	
	

}
