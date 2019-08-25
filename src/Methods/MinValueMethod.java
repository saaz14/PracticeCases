package Methods;

public class MinValueMethod {
	
	public static int minFuction(int n1, int n2) {
//		int min;
//		if (n1>n2) 
//			min = n2;
//		else
//			min = n1;
//		
//		return min;
		
		//---------------------------------------------
		
		//We can also use Ternary Operator instead of If else statement when we have a single liner if else condition.
		int min = (n1 > n2) ? n2 : n1;
		    //Test Condition ?True : False 
		return min;
	}

	public static void main(String[] args) {
		
		int minNum = minFuction(12, 9);
		System.out.println(minNum);

	}

}
