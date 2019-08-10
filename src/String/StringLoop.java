package String;

public class StringLoop {

	public static void main(String[] args) {
		
String str2 = "Aqeel Zaidi";
		
		for (int i = 0; i < str2.length(); i++) {
			
			if (str2.charAt(i) == ' ') {
				System.out.println("\n This is a space\n");
				continue;
			}
			
			int position = i+1;
			
			System.out.println("Char at position <" + position + "> " + str2.charAt(i));
		}

	}

}
