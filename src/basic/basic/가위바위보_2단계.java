package basic.basic;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보_2단계 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int com = ran.nextInt(3);
		
		System.out.println("가위(0) 바위(1) 보(2)!!");
		int sel = scan.nextInt();
		
		if(sel==com) {
			System.out.println("비겼다!");
		}
		if(com == 0 && sel == 1) {
			System.out.println("이겼다.");
		}
		if(com == 1 && sel == 2) {
			System.out.println("이겼다.");
		}
		if(com == 2 && sel == 0) {
			System.out.println("이겼다.");
		}
		
		if(com == 0 && sel == 2) {
			System.out.println("졌다.");
		}
		if(com == 1 && sel == 0) {
			System.out.println("졌다.");
		}
		if(com == 2 && sel == 1) {
			System.out.println("졌다.");
		}

	}

}
