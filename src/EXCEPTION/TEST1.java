package EXCEPTION;

public class TEST1 {

	public static void main(String[] args) {

		String str = "Welcome!";

		char[] chars = str.toCharArray();

		try {
			for (int i = 0; i <= chars.length; i++) {

				char c = chars[i];

				System.out.println(c);

			}

		} catch (Exception e) {
			System.out.println("Array index Problem");
		}
	}
}
