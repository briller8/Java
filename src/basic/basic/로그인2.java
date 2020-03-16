package basic.basic;

import java.util.Scanner;

//소요시간 : 2분;
public class 로그인2 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int dbId = 0;
		int dbPw = 0;
	
	
		System.out.println("가입할 ID를 입력하세요.");
		dbId = scan.nextInt();
		System.out.println("PW를 입력하세요.");
		dbPw = scan.nextInt();
	
		
		System.out.println("ID를 입력하세요.");
		int myId = scan.nextInt();
		System.out.println("PW를 입력하세요.");
		int myPw = scan.nextInt();
	
		if(myId==dbId&&myPw==dbPw) {
			System.out.println("로그인 되었습니다.");
		}else {
			System.out.println("로그인에 실패했습니다.");
		}
	}
}
