import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestClass {
	public static void main(String[] args) {
		/*String dateStr = "2022/07/30 20:40";
		long duration = 4000L;
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		LocalDateTime startDate = LocalDateTime.parse(dateStr, format);
		LocalDateTime endDate = startDate.plusSeconds(duration);
		
		System.out.println(startDate);
		System.out.println(endDate);*/
		
		String testStr = "stri@ngbef@@stringaft";
		String[] testArr = testStr.split("@@");
		
		for ( String str : testArr ) {
			System.out.println(str);
		}
	}
}
