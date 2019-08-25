package Methods;

public class Testmethod2 {
	
	public static void overloaded(int x , int y) {
		int total = x-y;
		System.out.println(total);
	}
//---------------------------------------------------
	
	public static void overloaded(double x , double y) {
		double total = x-y;
		System.out.println(total);
	}
//---------------------------------------------------
	
	public static void overloaded(float x , float y) {
		float total = x - y;
		System.out.println(total);
	}
//---------------------------------------------------
	
	public static void overloaded(long x , long y) {
		long total = x-y;
		System.out.println(total);
	}
//---------------------------------------------------
	
	public static void overloaded(char x , char y) {
		char total = x ;
		System.out.println(total);
	}
//---------------------------------------------------
	
	public static void overloaded(String x , String y) {
		String total = x.concat(y);
		System.out.println(total);
	}

	public static void main(String[] args) {
		
		overloaded(5 , 8);
		overloaded("Tech" , "Circle");
		overloaded(2.22f , 2.12f);
		overloaded(2.22 , 2.12);
		overloaded('a' , 'f');
		overloaded(3545453 , 3546231);
	}

}
