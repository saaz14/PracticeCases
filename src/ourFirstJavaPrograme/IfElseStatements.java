package ourFirstJavaPrograme;

import java.util.Scanner;

public class IfElseStatements {

	public static void main(String[] args) {
		
int MarksObtained;
int PassingMarks = 33;

Scanner in = new Scanner(System.in);

System.out.println("Please type in your Marks Obtained");
MarksObtained = in.nextInt();

if (MarksObtained >= PassingMarks) {
	System.out.println("Congratulations!! You Passed the Test");
}
else {
	System.out.println("Unfortunately, You did not Pass the Test. Better Luck Next Time.");
}

	}

}
