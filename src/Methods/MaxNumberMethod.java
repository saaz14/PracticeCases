package Methods;

public class MaxNumberMethod {
	
	public static int maxFunction(int i1 , int i2) {
	int max = (i1 > i2) ? i1 : i2;
	return max;
	}

	public static void main(String[] args) {
		
		int maxValue = maxFunction(25 , 27);
		System.out.println(maxValue);
	}

}
