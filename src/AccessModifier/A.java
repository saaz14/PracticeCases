package AccessModifier;

public class A {
	
	private int data = 40;
	private void msg() {
		System.out.println("Hello class !");
	}
	
	
	
	int defaultIntA = 400;
	void defaultmsg() {
		System.out.println("Hello Class! default msg method");
	}
	
	
	protected String strProtected = "Aqeel";
	protected void strProtectedmsg() {
		System.out.println("Hello class! This is Protected");
	}
	
	public String strPublic = "Zaidi";
	public void strPublicmsg() {
		System.out.println("Hello class! This is Public");
	}
	
	public static void main(String[] args) {
		
		A classA = new A();
		
		System.out.println(classA.data);
		classA.msg();
		
	//--------------------------------------------------	
		System.out.println();
		
		System.out.println(classA.defaultIntA);
		classA.defaultmsg();
		
	//--------------------------------------------------

		System.out.println();
		
		System.out.println(classA.strProtected);
		classA.strProtectedmsg();
		
	//--------------------------------------------------
		
        System.out.println();
		
		System.out.println(classA.strPublic);
		classA.strPublicmsg();
		
	//--------------------------------------------------
		
		
		
	}

}
