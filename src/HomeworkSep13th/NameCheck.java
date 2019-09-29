package HomeworkSep13th;

public class NameCheck {
	
	public static void main(String... data) {
		
		String john = "john";
		String jon = new String(john);
		
		System.out.println((john == jon) + " " + (john.equals(jon)));
		
	}

}
