package Homework;

public class Whileloop {

	public static void main(String[] args) {
	
		 int sum = 0, i = 100;
		   
	      while (i != 0) {
	         sum += i;
	         --i;
	      }
		   
	      System.out.println("Sum = " + sum);

	   /*   
	        sum = 0+100 = 100, i = 99
	        sum = 100+99 = 199, i = 98
	        sum = 199+98 = 297, i = 97
	    		  ... .. ...
	    		  ... .. ...
	    	sum = 5047+2 = 5049, i = 1
	        sum = 5049+1 = 5050, i = 0 
	        */
	}

}
