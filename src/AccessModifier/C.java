package AccessModifier;

import AccessModifier.A;

public class C extends A{
	
	public static void main(String[] args) {

		A classA = new A();
//		
//		classA.msg();
//		classA.data();
		
//		//Lets call default data and message in subClass. It will not work as its default and outside the package
//				System.out.println(classA.defaultIntA);
//				classA.defaultmsg();
//				

				System.out.println();
				
				//Lets call Protected data and message in subClass. It will not work as its protected and outside the package
				System.out.println(classA.strProtected);
				classA.strProtectedmsg();
				
				System.out.println();
				
				//Lets call Public data and message in subClass. It will work as its Public.
						System.out.println(classA.strPublic);
						classA.strPublicmsg();
	}

}
