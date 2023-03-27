package process;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Process {
	static LocalDateTime ldt = LocalDateTime.now();
	static DateTimeFormatter dtformat = DateTimeFormatter.ofPattern("yyyy/MM/dd H:mm:ss");
	static String nowDate = dtformat.format(ldt);

	public static void hello() {
		System.out.println("こんにちは！ここは日本です！");
		System.out.println("この寿司はうまい");
		System.out.println("寿司は和食です");
		System.out.println("今の現在日時は" + nowDate + "です");
	}
}
