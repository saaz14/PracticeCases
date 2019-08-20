package HomeworkAug18th;

import java.util.Arrays;

public class Part3 {

	public static void main(String[] args) {

		int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };

		String[] my_array2 = { "Java", "JDBC", "SQL", "Junit", "Selenium", "Jenkins", "Cucumber", "Agile", "SDLC",
				"WebDriver" };

		Arrays.parallelSort(my_array1);

		Arrays.parallelSort(my_array2);

		for (int i = 0; i < my_array1.length; i++) {
			System.out.print("\t" + my_array1[i]);
		}
		System.out.println("");
		for (String i : my_array2) {
		System.out.print("\n" + i);
		}

	}

}
