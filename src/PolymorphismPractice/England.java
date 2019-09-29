package PolymorphismPractice;

public class England extends Countries {
	public England() {
		super("Englnd");
	}
	
	@Override
	public String Currency() {
		return "British Pound";
	}

}
