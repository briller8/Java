package basic.Repetitive;

import java.util.Scanner;

//소요시간 : 8분;
public class ATM_ {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int log = -1;		// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(log==-1) {
					System.out.println("계좌를 입력하세요.");
					int myAcc=scan.nextInt();
					System.out.println("비밀번호를 입력하세요.");
					int myPw=scan.nextInt();
					
					if(dbAcc1==myAcc&&dbPw1==myPw) {
						System.out.println(dbAcc1+"님 로그인되었습니다.");
						log=1;
					}else if(dbAcc2==myAcc&&dbPw2==myPw) {
						System.out.println(dbAcc2+"님 로그인되었습니다.");
						log=1;
					}else {
						System.out.println("계좌번호와 비밀번호를 확인하세요.");
					}
				}				
			}
			else if(sel == 2) {
				if(log==-1) {
					System.out.println("로그인 후 이용가능합니다.");
				}else if(log==1) {
					System.out.println("로그아웃되었습니다.");
					log=-1;
				}
			}
			else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}

	}
}
