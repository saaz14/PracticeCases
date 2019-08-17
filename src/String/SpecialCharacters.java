package String;

public class SpecialCharacters {

	public static void main(String[] args) {
		String abc = "My name is \"Aqeel Zaidi\"";
		String def = "I am 5\"11\' tall";
		String ghi = "I live in Stafford\\VA";
		
		System.out.println(abc.concat(". ").concat(def).concat(". ").concat(ghi));

	}

}
