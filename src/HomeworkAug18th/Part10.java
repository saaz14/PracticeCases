package HomeworkAug18th;

import java.util.Arrays;

public class Part10 {

	public static void main(String[] args) {
	
		int intArray1 []= {1,3,5,7};
		int intArray2 []= {1,3,5,7,8};
		int intArray3 []= {1,3,5,7,8}; 
		
		System.out.println("Is array 1 equal to array 2?? " + Arrays.equals(intArray1, intArray2));
	    System.out.println("Is array 1 equal to array 3?? " +Arrays.equals(intArray1, intArray2));
	   
	    System.out.println("Is array 2 equal to array 3?? " + Arrays.equals(intArray2, intArray3));

	}

}
