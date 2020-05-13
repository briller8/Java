package Object.Object;
/*
 *#날짜 및 시간 출력 서식 지정방법
 *	- Date date = new Date();
 *	- SimpleDateFormat sdf = new SimpleDateFormat("날짜 및 시간 서식");
 * 
 * #날짜 및 시간 서식 적용 방법
 * 	.sdf.format(date);
 * 
 * #날짜 및 시간 출력 서식 문자의 종류 : simpledateformat 키워드로 구글링!
 * 
 * #System.currentTimeMillis();
 * 	- 1970년 1월 1일 자정부터 메소드가 실행되는 순까지 지나온 시간을 밀리초 단위로 얻어온다.
 * 	- 반드시 long 타입으로 처리 
 */

import java.text.SimpleDateFormat;

public class Date {
	public static void main(String[] args) {
		
		Date d = new Date(); // 현재 컴퓨터 시스템에 날짜와 시간을 얻어온다.
		System.out.println(d);
	
		SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM월 dd일 E요일");
		System.out.println(sdf.format(d));
		
		long time = System.currentTimeMillis();
		System.out.println(time);
		System.out.println(sdf.format(time));
	}	
	
}
