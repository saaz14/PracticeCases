package GettersSetters;

public class testgetset {

	public static void main(String[] args) {
		
		getset xyz = new getset();
		
		xyz.setMake("Samsung");
		xyz.setModel("Note9");
		xyz.setYear(2018);
		
		
		System.out.println(xyz.getMake());
		System.out.println(xyz.getModel());
		System.out.println(xyz.getYear());
	}


}
