package DateAndTime;

// To display the current date and time, import the java.time.LocalDateTime class, and use its now() method:

import java.time.LocalDateTime;

public class CurrentDateTime {

	public static void main(String[] args) {

		LocalDateTime MyDateTime = LocalDateTime.now();
		System.out.println(MyDateTime);
	}

}
