package DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDateTime {

	public static void main(String[] args) {

		LocalDateTime MyFormatted = LocalDateTime.now();
		System.out.println("Before Formatting: " + MyFormatted);
		
		DateTimeFormatter MyFormatted1 = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
		DateTimeFormatter MyFormatted2 = DateTimeFormatter.ofPattern("MMM-dd-yyyy HH:mm:ss");
		DateTimeFormatter MyFormatted3 = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
		DateTimeFormatter MyFormatted4 = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
		
		String FormattedDate = MyFormatted.format(MyFormatted1);
		System.out.println("After Formatting: " + FormattedDate);
		
		String FormattedDate2 = MyFormatted.format(MyFormatted2);
		System.out.println("After Formatting: " + FormattedDate2);
		
		String FormattedDate3 = MyFormatted.format(MyFormatted3);
		System.out.println("After Formatting: " + FormattedDate3);
		
		String FormattedDate4 = MyFormatted.format(MyFormatted4);
		System.out.println("After Formatting: " + FormattedDate4);
		
	}

}
