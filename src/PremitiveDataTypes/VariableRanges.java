package PremitiveDataTypes;

public class VariableRanges {

	public static void main(String[] args) {
		
		
		
		//Declaring Variables and assigning Values to these Variables
		
		double Dvalue = 4.53;
		float Fvalue = 1.6f;
		int Intvalue = -2147483648;
		int INvalue = 2147483647;
		byte Bvalue = -128;
		byte BYvalue = 127;
		short Svalue = -32768;
		short SHvalue = 32767;
		long Lvalue = -9223372036854775808l;
		long LOvalue = 9223372036854775807l;
		char Cvalue = 'a';
		boolean BOvalue = true;
		boolean BOLvalue = false;
		String STvalue = "This is the example of String Value";
		
		
		
		
		//Using the declared Variables to display the Ranges of Variables.
		
		System.out.println("Double variable" + " " + Dvalue + ", ");
		System.out.println("Float variable" + " " +Fvalue);
		System.out.println(" ");
		System.out.println("Byte variable ranges between " + Bvalue + " and " + BYvalue + ", ");
		System.out.println("Short variable ranges between " + Svalue + " and " + SHvalue + ", ");
		System.out.println("Intiger variable ranges between " + Intvalue + " and " + INvalue + ", ");
		System.out.println("Long variable ranges between " + Lvalue + " and " + LOvalue + ", ");
		System.out.println(" ");
		System.out.println("Char variable can hold only a single character like" + " " + Cvalue + ", ");
		System.out.println(" ");
		System.out.println("Boolean variable can either be " + BOvalue + " or " + BOLvalue + ", ");
		System.out.println(" ");
		System.out.println(STvalue);
		
		
		//We can Also use these commands to display Range for Variables.
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("Long Variable ranges are " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
		System.out.println("Byte Variable ranges are " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
		System.out.println("Short Variable ranges are " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
		System.out.println("Integer Variable ranges are " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
		System.out.println("Char Variable ranges are " + Character.MIN_VALUE + " to " + Character.MAX_VALUE);
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		//Class Practice for variable packages.
		int a = 21321;
		int b = 6555466;
		int maxvalue = Integer.max(a, b);
		
		System.out.println(maxvalue);
		
		String strInteger = "554605622";
		int IntNum = Integer.parseInt(strInteger);
		System.out.println(IntNum);
		//testing
	

	}

}
