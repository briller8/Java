package basic.File;

import java.util.Scanner;

public class compare {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name= "홍길동.";
		
		System.out.println("이름을 입력하세요 :");
		String myName= scan.next();
		
		if(name==myName) {
			System.out.println("일치.");
		}else {
			System.out.println("불일치.");
		}
		
		if(name.equals(myName)) {
			System.out.println("equals()메서드 : 일치.");
		}else {
			System.out.println("equals()메서드 : 불일치.");

		}
		
	}

}
