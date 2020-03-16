package basic.Repetitive;

import java.util.Scanner;

public class 뒤로가기 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.남성의류");
			System.out.println("2.여성의류");
			System.out.println("3.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				boolean exit = true;
				
				System.out.println("1)티셔츠");
				System.out.println("2)바지");
				System.out.println("3)뒤로가기");

				int choice=scan.nextInt();
				
				if(choice==3) {
					exit=false;
				}

			}
			else if(sel == 2) {
				boolean exit = true;
				
				System.out.println("1)가디건");
				System.out.println("2)치마");
				System.out.println("3)뒤로가기");
				
				int choice=scan.nextInt();
				
				if(choice==3) {
					exit=false;
				}
			}
			else if(sel == 3) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
	}
}
