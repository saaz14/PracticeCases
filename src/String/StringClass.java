package String;

public class StringClass {

	public static void main(String[] args) {

		String str1 = "This is a test string case";
		int length = str1.length();   //counts the total length of the string
		System.out.println(str1);

		System.out.println("Total nunber of caharactors in this sentence are: " + str1.length());
		System.out.println("First Charactor of this sentence is: " + str1.charAt(0));
		System.out.println("Last Charactor of this sentence is: " + str1.charAt(length - 1)); //Since Charactors starts from 0 and continues, we have to minus 1 from length to display the last chractor

	


	}

}
