package String;

public class UpperLowerCases {

	public static void main(String[] args) {
		
		String Name = "Aqeel_-_Zaidi";
		String UppercaseName = Name.toUpperCase();
		String LowercaseName = Name.toLowerCase();
		String ReplaceName = Name.replace("Zaidi" , "Abbas");
		
		System.out.println("This is Regular string: " + Name);
		System.out.println("\nThis is Upper case string: \n" + UppercaseName);
		System.out.println("\nThis is Lower case string:\n" + LowercaseName);
		
		System.out.println("\nComparing String Name and String Lower case. Are they Equal?\n" + Name.equals(LowercaseName));
		System.out.println("\nNow Lets ignore case sensitive and compare the two strings. Are they Equal now?\n" + Name.equalsIgnoreCase(LowercaseName));
		
		System.out.println("\nWhat is the total Length of this String:\n" + Name.length());
		System.out.println("\nWhat is the 1st Charactor of the String?\n" + Name.charAt(0));
		System.out.println("\nWhat is the last Charactor of this String?\n" + Name.charAt(Name.length() - 1));
		
		//To get the middle charactor we 1st have to define am int and divide the Length with 2
		int middleChar = (Name.length()-1)/2;
		System.out.println("\nWhat is the Middle Charactor of this String?\n"+Name.charAt(middleChar));
		
		System.out.println("\nReplacing Last Name:\n" + ReplaceName);
		
		System.out.println("\nCharactors before the Last Name are: \n" +Name.indexOf("Zaidi"));

	}

}
