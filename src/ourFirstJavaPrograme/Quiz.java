package ourFirstJavaPrograme;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
		Scanner quiz = new Scanner(System.in);
		
	
//		int CorrectAns = 1;
//		
//		System.out.println("====<QUESTION # 1>====");
//		System.out.println("MULTIPLE CHOICE");
//		System.out.println(" ");
//		System.out.println("Brazil is Located in");
//		System.out.println("1: South America || 2: North America || 3: Europe || 4: Africa");
//		int Answer1 = quiz.nextInt();
//		
//		if (Answer1 == CorrectAns) {
//			System.out.println("CORRECT");
//		}
//		else {
//			System.out.println("INCORRECT");
//		}
		
/*		boolean theCorrectAnser = false;
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("====<QUESTION #2>====");
		System.out.println("TRUE or FALSE");
		System.out.println(" ");
		System.out.println("Amazon is the longest river in the World.");
		
		boolean Answer2 = quiz.nextBoolean();
		
		//Boolean.compare(Answer2, theCorrectAnser);
		
		if (Answer2 == theCorrectAnser) {
			System.out.println("CORRECT");
		}
		else {
			System.out.println("INCORRECT");
		}
		
		
*/		
		String city = "London";
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("====<QUESTION #3>====");
		System.out.println(" ");
		System.out.println("Name the Capital city of England");
		String Answer3 = quiz.nextLine();
		
		if (Answer3 == city) {
			System.out.println("CORRECT");
		}
		else {
			System.out.println("INCORRECT");
			
			quiz.close();
		}
		

	}

}
