package Methods;

public class MonthsArrayLoop {
	
	static String [] months = {"January" , "February" , "March" , "April" , "May" , "June" , "July" , "August" , "September" , "October" , "November" , "December"};
	static void loopIt(String Label) {
		System.out.println(Label);
		for (int i = 0 ; i<Label.length(); i++) {
			System.out.print("*");
			}
		System.out.println();
		for (String disp : months) {
			System.out.println(disp);
		}
	}

	public static void main(String[] args) {
		
		loopIt("These are the Months of Years");
	}

}
