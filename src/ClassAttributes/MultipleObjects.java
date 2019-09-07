package ClassAttributes;

public class MultipleObjects {
	
	int x = 80;
	
	public static void main(String [] args) {
		
		MultipleObjects Shah1 = new MultipleObjects();
		MultipleObjects Shah2 = new MultipleObjects();
		Shah2.x = 100;
		
		System.out.println(Shah1.x);
		System.out.println(Shah2.x);
		
	}

}
