package Arrays;

import java.util.Arrays;

public class EnhancedForLoop {

	public static void main(String[] args) {
	
//		String test [] = {"Aqeel", "Faizan" , "Naseem"};
//		
//		for (String singleStr : test) {
//			System.out.println(singleStr);
//			
//		}
		
//-----------------------------------------------------------------
//		
//		char [] test1 = {'a','b','c','d','e','f'};
//		
//		
//		
//		for (char go : test1) {
//			
//			if (go == 'd') {	
//				
//				test1[3] = 'D';
//				test1[4] = 'E';
//				
//			}
//			
//		}
//		
//		System.out.println(test1);
		
		
//--------------------------------------------------------------------------------------
		
//		char abc [] = {'a','b','c','d','e','f','g','h'};
//		
//		int index = 0;
//		
//		for (char stop : abc) {
//			
//			if (stop == 'b') {
//				abc[index] = 'B';
//			}
//			
//			if (stop == 'd') {
//				abc[index] = 'D';
//			}
//			
//			if (stop == 'f') {
//				abc[index] = 'F';
//			}
//			
//			index++;
//		}
//		
//		System.out.println(abc);

		
//-----------------------------------------------------------------------------
		
//		String cars[] = {"Toyota","Honda","Ferrari","GM","Ford","Nissan"};
//		
//		int index = 0;
//		
//		for (String make : cars) {
//			
//			if (make.equalsIgnoreCase("gm")) {
//				cars[index] = "General Motors";
//			}
//			
//			index++;
//		}
//		
//		for (String str : cars) {
//			System.out.println(str);
//		}
		    //------------------------
//		for (int i = 0; i < cars.length; i++) {
//			
//			if (cars[i].equalsIgnoreCase("gm")) {
//				cars[i] = "General Motors";
//				
//			}
//			
//		}
//		
//		for (String str : cars) {
//			System.out.println(str);
//		}
//-----------------------------------------------------------------------------
		
		String Strs [] = {"a","b","z","h","w","r"};
		
		int nums [] = {3,1,44,23,2,6};
		
		Arrays.parallelSort(Strs);
		
		Arrays.parallelSort(nums);
		
		for (int i = 0; i < Strs.length; i++) {
			System.out.print(Strs[i]);
		}
		
		for (int i : nums) {
		System.out.print(i);
		}
//		int bingo [][] = { {2,4,6,8} , {3,5,7,9} };
//		
//		for (int bin : bingo[0]) {
//			System.out.println(bin);
//		}
	}

}
