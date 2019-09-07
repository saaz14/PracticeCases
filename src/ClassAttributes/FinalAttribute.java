package ClassAttributes;

public class FinalAttribute {
	
	final int x = 20;

	public static void main(String[] args) {
		
		FinalAttribute Shah = new FinalAttribute();
	//	Shah.x = 10; // Here if we try to modify the value of x it will generate an error as the value is final.
		
		System.out.println(Shah.x);
	}

}
