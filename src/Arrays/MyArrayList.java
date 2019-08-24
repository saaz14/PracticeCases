package Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MyArrayList {

	public static void main(String[] args) {
		
		
		//This is the regular Array that is Pre-declared
		String[] ArrayListOld = {"Aqeel", "Faizan" , "Sajjad" , "Muneef"};
		
		for (String arr : ArrayListOld) {
			System.out.println(arr);
		}
		
		System.out.println("");
		System.out.println("<<<<< Printing ArrayList using ArrayList >>>>>");
		//This is ArrayList method that can add elements later in the coding
		ArrayList<String>List = new ArrayList<String>();
		
		List.add("Aqeel");
		List.add("Faizan");
		List.add("Sajjad");
		List.add("Muneef");
		
		System.out.println(List + "\n");
		

		
		// We can use Iterator method using While loop as well to print this ArrayList
		System.out.println("<<<<< Printing ArrayList using Iterator interface >>>>>");
		Iterator<String> itr = List.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}  
		
		System.out.println("");
		
		//For.each Loop
		System.out.println("<<<<< Iterating using For Each Loop >>>>>");
		for (String obj : List) {
			System.out.println(obj);
		}
		
		System.out.println("");
			//Iterating in reverse
			System.out.println("<<<<< Printing ArrayList using Iterator interface in reverse >>>>>");
			ListIterator<String> List1 = List.listIterator(List.size());
			
			while (List1.hasPrevious()) {
				String str = List1.previous();
				System.out.println(str);
			}
			
			System.out.println();
		
			// Printing List through Loop
			System.out.println("List Through Loop");
			for (int i = 0; i < List.size(); i++) {
				System.out.println(List.get(i));
			}
			
			System.out.println("");
			
			//The ForEach() method is a new feature, introduced in Java 8.
			System.out.println("List Through For Each() method");
			List.forEach(element -> System.out.println(element)); //Here we are using Lambda expression
			
		
            System.out.println("");
			
			//For Each Remaining() method
			System.out.println("List Through ForEachRemaining() method");
			Iterator<String> itr2 = List.iterator();
			itr2.forEachRemaining(element -> System.out.println(element)); //Here we are using Lambda expression
			
			
			 System.out.println("");
				
				//Adding Elements to Array list
				System.out.println("ArrayList example to ADD Element");
				
				ArrayList<String> al = new ArrayList<String>();
				System.out.println("Initial List of Elements : " + al); // There are no elements defined here so it will print blank
				
				//Now Lets add elemenst to this ArrayList
				al.add("Lahore");
				al.add("Karachi");
				al.add("Islamabad");
				al.add("Peshawar");
				al.add("Quetta");
				
				System.out.println("After adding Elements to the Array List: " + al);
				
				//Creating two array lists and combine them together.
				ArrayList<String> al2 = new ArrayList<String>();
				al2.add("Gujanwala");
				al2.add("Hyderabad");
				al.addAll(al2);
				System.out.println("After Combining the two Array List: " + al);
				
				//Adding an Element at a specific Position
				al.add(5,"Faisalabad");
				System.out.println("After adding an element at index 5, our array shows " + al);
				
				//Adding 3rd list elements to the 1st list at specific position.
				ArrayList<String> al3 = new ArrayList<String>();
				al3.add("Gawader");
				al3.add("Multan");			
				al.addAll(6 , al3);
				System.out.println("Afer adding new element List at a specific index: " + al);
				
				
                System.out.println("");
				
				//Removing Elements to Array list
				System.out.println("ArrayList example to Remove Element");
				ArrayList<String> al123 = new ArrayList<String>();
				al123.add("Apple");
				al123.add("Banana");
				al123.add("Orange");
				al123.add("Pear");
				al123.add("Strawberry");
				System.out.println("List of Elements initially is: " + al123);
				
				//Removig specific Element from ArrayList
				al123.remove("Pear");
				System.out.println("After removing an element: " + al123);
				
				//Removing an element on the basis of index
				al123.remove(2);
				System.out.println("List of elements after removing element on the basis of index: " + al123);
				
				//creating another array list
				ArrayList<String> al456 = new ArrayList<String>();
				al456.add("Cilantro");
				al456.add("Tomato");
				
				//Adding new elements to previous list
				al123.addAll(al456);
				System.out.println("Afer adding two elemenst we get this: " + al123);
				
				//Removing all the elements of 2nd list from the 1st.
				al123.removeAll(al456);
				System.out.println("After removing new element list from the orignal lst we get; " + al123);
				
				//Removing elements on the baasis of specified condition.
				al123.removeIf(i -> i.contains("Apple"));
				System.out.println("After applying removeIf() method: " +al123);
				
				//Removing all the elements available in the list.
				al123.clear();
				System.out.println("After applying clear() command: "  + al123);
				
				
				
				System.out.println("");
				//Retaining method to compare two array list and retain the duplicate
				System.out.println("RetainAll Method Array List");
				
				ArrayList<String> alc = new ArrayList<String>();
				alc.add("Pakistan");
				alc.add("India");
				alc.add("Iran");
				alc.add("China");
				
				 ArrayList<String> al20=new ArrayList<String>();  
		         al20.add("Iraq");  
		         al20.add("Egypt");
		         al20.add("China");
		         
		         alc.retainAll(al20);   
		         System.out.println("iterating the elements after retaining the elements of al2" + alc);
		         
		         
		         
		         System.out.println("");
		         //Checking if the list is empty or not
		         System.out.println("===========ArrayList example of isEmpty() method=========");
		         
		         ArrayList<String> alz=new ArrayList<String>();  
		         
		         System.out.println("Is ArrayList Empty: "+alz.isEmpty());  
		         
		         alz.add("Android");    
		         alz.add("IOS");    
		         alz.add("Windows");    
		         
		         System.out.println("After Insertion");  
		         
		         System.out.println("Is ArrayList Empty: "+alz.isEmpty());   
				
				

	}

}
