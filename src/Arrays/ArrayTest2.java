package Arrays;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		char [] abc = {'a', 'b', 'c', 'd', 'e', 'f'};
		
		System.out.println("Element at index 0 is: " + abc[0]);
		System.out.println("Total Length of array is: " + abc.length);
		
	//----------------------------------------------------------------------------------	
		
		boolean def [] = new boolean [4];
		def[0] = true;
		def[1] = true;
		def[2] = false;
		def[3] = true;
		
		System.out.println("\n\tElement at index 1 using boolean array is: " + def[1]);
		System.out.println("\tTotal Length of array using Boolean is: " + def.length);
		
	//-------------------------------------------------------------------------------------------------	
		
		double ghi [] = {1.1 , 2.21, 3.32, 4.43, 5.54};
		
		System.out.println("\n\t\tElement at index 4 using Boolean array is: " + ghi[4]);
		System.out.println("\t\tTotal length of Boolean array is: " + ghi.length);
		
	//----------------------------------------------------------------------------------------	
		
		String jkl [] = {"Apple", "Samsung", "LG", "Motorola", "Nokia", "Huawei" };
		
		System.out.println("\n\t\t\tElement at Index 2 using String is: " + jkl[2]);
		System.out.println("\t\t\tTotal length of this array is: " + jkl.length);
	//---------------------------------------------------------------------------------------	
		
		String mng[] = new String [6];
		mng[0] = "Apple";
		mng[1] = "Samsung";
		mng[2] = "LG";
		mng[3] = "Motorola";
		mng[4] = "Nokia";
		mng[5] = "Huawei";
		
		System.out.println("\n\t\t\tWe can also use this method to print  the same Index 2 of String Array: " + mng[2]);
		System.out.println("\t\t\tTotal length of this array is: " + mng.length);
//------------------------------------------------------------------------------------------		
		
		char name [] = new char [5];
		String name11 = "Aqeel";
		
		for (int i = 0; i < name11.length(); i++) {
			char singlechar = name11.charAt(i);
			name[i] = singlechar;
			
		}
		
		System.out.println(name);
	//---------------------------------------------------------------------------------------	
	
		
	}

}
