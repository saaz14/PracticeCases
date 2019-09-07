package AccessModifier;

public class B {

	public static void main(String[] args) {

		A classA = new A();
		// Trying to access Private data and msg outside class. So it errors out
//		classA.msg();
//		classA.data();
		
		
		//Lets call default data and message outside class within same package. It will work
		System.out.println(classA.defaultIntA);
		classA.defaultmsg();
		
		System.out.println();
		
		//Lets call Protected data and message outside class within same package. It will work
				System.out.println(classA.strProtected);
				classA.strProtectedmsg();
				
				
		System.out.println();
				
		//Lets call Public data and message outside class within same package. It will work
				System.out.println(classA.strPublic);
				classA.strPublicmsg();
	}

}
