package Sep8th;

public class thismethodtest {
	
	void methodOne() {
		System.out.println("Inside Method One");
	}
	
	void methodTwo() {
		System.out.println("Inside Method Two");
		this.methodOne();
	}
	public static void main(String[] args) {

		thismethodtest obj = new thismethodtest();
		obj.methodTwo();
	
	}

}
