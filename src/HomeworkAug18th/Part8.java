package HomeworkAug18th;

public class Part8 {

	public static void main(String[] args) {
		
		String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
		
		for (int i = 0; i < my_array.length-1; i++) {
			for (int j = i + 1; j < my_array.length; j++) {
				if ((my_array[i] == my_array[j])) {
					System.out.println("Duplicate value in this Array : " + my_array[j]);
				}
			}
		}
	}

}
