package basic.Repetitive;

import java.util.Scanner;

public class 반복문종료 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.println("숫자를 입력하세요. 종료를 원하면 '-100'을 입력하세요.");
			int num = scan.nextInt();

			if(num==-100) {
				System.out.println("프로그램 종료");
				run=false;
			}
			
		}
	}
}
