package HomeworkSep13th;

public class baloon {

	public static void main(String[] args) {
		boolean balloonInflated = false;
		do {
			if (!balloonInflated) { balloonInflated = true; System.out.print("inflate-");
			}
		} while (!balloonInflated); System.out.println("done");
	}
}
