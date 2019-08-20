package Arrays;

public class MultiDimentinalArrays {

	public static void main(String[] args) {

		int array1 [] = { 1, 2, 3, 4};
		int array2 [] = { 5, 6, 7 };
		int[][] MyNumbers = { array1 , array2 };

		System.out.println(MyNumbers.length);
		System.out.println(MyNumbers[0][3]);
		System.out.println(MyNumbers[1][2]);
	}

}
