package chapter10;

import java.util.Calendar;
import java.util.Scanner;

public class Practice {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("연도: YYYY, 월: 1-12, 일: 1-31");
	int birthYear = sc.nextInt();
	int birthMonth = sc.nextInt();
	int birthDay = sc.nextInt();
	
	// 2. 현재 날짜와 시간을 포함하는 Calendar 인스턴스 생성
	Calendar today = Calendar.getInstance();
	
	// 3. 사용자의 생일 설정(월은 0부터 시작하기 때문에 -1 뺌)
	Calendar birthday = Calendar.getInstance();
	birthday.set(Calendar.YEAR, birthYear);
	birthday.set(Calendar.MONTH, birthMonth - 1);
	birthday.set(Calendar.DAY_OF_MONTH, birthDay);
	
	if (birthday.before(today)) {
		
		birthday.set(Calendar.YEAR, today.get(Calendar.YEAR)+1);
	}
	
	long difference = (birthday.getTimeInMillis())
			/ (1000 * 60 * 60 *24);
	
	System.out.println("남은 생일은: " + difference);
	
	
	
	
	
}
}
