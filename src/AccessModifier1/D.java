package AccessModifier1;

import AccessModifier.A;

public class D {
	
	String str = "Shah jee!";

	public static void main(String[] args) {

		A classA = new A();
		
//		classA.msg();
//		classA.data();
		
//		//Lets call default data and message in a class in different package. It will not work
//		System.out.println(classA.defaultIntA);
//		classA.defaultmsg();
//	
//		//Lets call protected data and message in a class in different package. It will not work
//		System.out.println(classA.strProtected);
//		classA.strProtectedmsg();
//		
//		//Lets call Public data and message outside the package. It will work as its Public.
//		System.out.println(classA.strPublic);
//		classA.strPublicmsg();
//		
//		//-------------------------------------------------------------------------
		
		D ClassD = new D();
		ClassD.msg();
		
		D ClassD2 = new D();
		ClassD2.str = "The Great!";
		ClassD2.msg();
		
	}
	
private void msg () {
	System.out.println(str);

}
}