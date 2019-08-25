package Methods;

import java.util.Scanner;

public class TestMethod {
	public static String aqcode(String str , int length ) {
		String newStr = null;
		
		if (str.length() == length) {
			newStr = str;
		}
		
		else if (str.length() > length) {
			newStr = str.substring(str.length()-length);
		}
		
		else if (str.length() < length) {
			int difference = length - str.length();
			
			while (difference >= 0) {
				str=str.concat("a");
				if (str.length() == length) {
					break;
				}
				difference--;
			}
			newStr = str;
		}
		
		return newStr;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("If Length of Word is less than the Number entered, add \'a\' at the end of word to match it with Number");
		System.out.println("If Length of Word is More than the Number entered, show only the last alphabets matching the nnumbers");
		System.out.println("If Length of Word is equal to the length of number, just display the word\n");
		System.out.print("Enter a word: ");
		String word = input.nextLine();
		
		System.out.print("Enter the number: ");
		int number = input.nextInt();
		
		String result = aqcode(word , number);
		System.out.println(result);

	}

}
