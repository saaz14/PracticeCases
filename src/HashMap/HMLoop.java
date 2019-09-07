package HashMap;

import java.util.HashMap;

public class HMLoop {

	public static void main(String[] args) {

		HashMap<String , String> Cars = new HashMap<String , String>();
		Cars.put("Honda", "Pilot");
		Cars.put("Toyota" , "Highlander");
		Cars.put("Nissan", "PathFinder");
		Cars.put("Chevrolett" , "Traverse");
		Cars.put("Acura" , "MDX");
		
		
		//to print out keys of HashMap list
		for (String i : Cars.keySet()) {
			System.out.println(i);
		}
		System.out.println(" ");
		//To print out Values of HashMap list
		for (String j : Cars.values()) {
			System.out.println(j);
		}
		System.out.println(" ");
		//To Print Keys and Values.
		for (String k : Cars.keySet()) {
			System.out.println("Key: " + k + " / Value: " + Cars.get(k));
		}
		
	}
	

}
