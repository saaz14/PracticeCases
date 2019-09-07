package HashMap;

import java.util.HashMap;

public class HM {

	public static void main(String[] args) {

		HashMap <String, String> BioData = new HashMap<String, String>();
		
		BioData.put("Aqeel" , "36");
		BioData.put("Imran" , "33");
		BioData.put("Muneef" , "29");
		BioData.put("Sajjad" , "24");
		BioData.put("Marvin" , "20");
		BioData.put("Faizan" , "28");
		
		System.out.println(BioData);
		
		System.out.println(BioData.get("Aqeel"));
		
		System.out.println("Size of this Hashmap list is: " + BioData.size());
		
		BioData.remove("Faizan");
		System.out.println("After removing Faizan: " + BioData);
		
	//	BioData.clear();
	//	System.out.println(BioData);
		
		
	}

}
