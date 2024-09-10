package chapter10;

import java.util.Calendar;
import java.util.Date;

public class JavaUtil {
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println(date.getTime());
		
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year+ "" + month + "" + day); // 2024 9 9
		
		
		
	}
}
