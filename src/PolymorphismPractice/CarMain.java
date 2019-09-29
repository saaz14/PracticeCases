package PolymorphismPractice;

public class CarMain {

	public static void main(String[] args) {

		Car corola = new ToyotaCorola();
		Car highlander = new ToyotaHighlander();
		Car expedition = new FordExpedition();
		
		String corolagroup = (corola.getName() + corola.getmake() + ToyotaCorola.gettype());
		String highlandergroup = (highlander.getName() + highlander.getmake() + ToyotaHighlander.gettype());
		String expeditiongroup = (expedition.getName() + expedition.getmake() + FordExpedition.gettype());
		
		String [] str = {corolagroup , highlandergroup , expeditiongroup};
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		
//		System.out.println(corola.getName() + " " + corola.getmake() + ". " + ToyotaCorola.gettype());
//		System.out.println(highlander.getName() + " " + highlander.getmake() + ". " + ToyotaHighlander.gettype());
//		System.out.println(expedition.getName() + " " + expedition.getmake() + ". " + FordExpedition.gettype());

	}

}
