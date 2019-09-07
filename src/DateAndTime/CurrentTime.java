package DateAndTime;

// To display the current time (hour, minute, second, and milliseconds), import the java.time.LocalTime class, and use its now() method:

import java.time.LocalTime;

public class CurrentTime {
	

	public static void main(String[] args) {

		LocalTime MyTime = LocalTime.now();
		System.out.println(MyTime);
	}

}
