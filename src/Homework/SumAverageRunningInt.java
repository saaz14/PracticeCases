package Homework;

public class SumAverageRunningInt {

	public static void main(String[] args) {

		int sum = 0;
		double average;
		int lowerbound = 1;
		int upperbound = 100;

		
		  for (int number = lowerbound; number <= upperbound; ++number) {
		  
		  sum += number;
		  
		 
		  }
		 
		 System.out.println("Sum of 1 to 100 is using for loop is : " + sum);
		 
		 average = (double)sum/(double)upperbound;
		 
		 System.out.println("Average is : " + average);
		 
		
		 
		 //same result using while loop below
		
		 while (lowerbound <= upperbound) {
	         sum += lowerbound;
	         ++lowerbound;
	      }
		 System.out.println("Sum using while loop is : " + sum);
		 System.out.println("Average is : " + average);
		 
		

	}

}
