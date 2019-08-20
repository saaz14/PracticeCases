package HomeworkAug18th;

import java.util.Arrays;

public class Part4 {

	public static void main(String[] args) {
		
		String[] my_array2 = {"Java","JDBC","SQL","Junit","Selenium","Jenkins","Cucumber","Agile","SDLC","WebDriver"};
		
		int index = 0;
		
		for (String arr : my_array2) {
			
			if (arr.equalsIgnoreCase("JENKINS")) {
				System.out.println("Index of \"Jenkins\" before sorting is: " + index);
			}
			
			index++;
		}
		
		Arrays.parallelSort(my_array2);
		
int index1 = 0;
		
		for (String arr1 : my_array2) {
			
			if (arr1.equalsIgnoreCase("JENKINS")) {
				System.out.println("\nIndex of \"Jenkins\" after sorting is: " + index1);
			}
			
			index1++;
		}
		
		
	}

}
