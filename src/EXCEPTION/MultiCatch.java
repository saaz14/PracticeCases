package EXCEPTION;

public class MultiCatch {

	public static void main(String[] args) {
		
		String str = "Welcome!";

		char[] chars = str.toCharArray();

		try {
			System.out.println();
			
			char lastchar = chars[chars.length-1];
			System.out.println(lastchar);		
			
			String subStr = str.substring(9);
			System.out.println(subStr);
		}
		
		catch (ArrayIndexOutOfBoundsException e1){
			System.out.println("Array Index Problem");
		}
		
		catch (StringIndexOutOfBoundsException e2) {
			System.out.println("String Index Problem");
		}

	}

}
