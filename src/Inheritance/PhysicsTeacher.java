package Inheritance;

public class PhysicsTeacher extends Teacher {

	String mainSubject = "Physics";

	public static void main(String[] args) {

		PhysicsTeacher obj = new PhysicsTeacher();

//		System.out.println("\"" + obj.collegeName + "\"" + " is hiring for new " + "\"" + obj.designation + "\""+ " for the subject of " + "\"" + obj.mainSubject + "\"");
//		obj.does();
		
		obj.setCollegeName("F.C.College");
		obj.setDesignation("Teacher");
		
		
		
		System.out.println(obj.getCollegeName());
		System.out.println(obj.getDesignation());
		

	}

}
