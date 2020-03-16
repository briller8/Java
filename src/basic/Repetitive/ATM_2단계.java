package basic.Repetitive;

import java.util.Scanner;

//소요시간 : 9분;
public class ATM_2단계 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;	
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("입금할 금액을 입력하세요.");
				int money=scan.nextInt();
				
				myMoney=myMoney+money;
				System.out.println("입금을 완료했습니다.");
			}
			else if(sel == 2) {
				System.out.println("출금할 금액을 입력하세요.");
				int money=scan.nextInt();
				
				if(money<=myMoney) {
					myMoney=myMoney-money;
					System.out.println("출금이 완료되었습니다.");

				}else {
					System.out.println("잔액이 부족합니다.");

				}
				
			}
			else if(sel == 3) {
				System.out.println("이체할 계좌번호를 입력하세요.");
				int acc=scan.nextInt();
				
				if(acc==yourAcc) {
					
					System.out.println("출금할 금액을 입력하세요.");
					int money=scan.nextInt();
					
					if(money<=myMoney) {
						myMoney=myMoney-money;
						yourMoney=yourMoney+money;
						System.out.println("이체가 완료되었습니다.");
	
					}else {
						System.out.println("잔액이 부족합니다.");

					}
				}else {
					System.out.println("계좌번호를 확인하세요.");
				}				
			}
			else if(sel == 4) {
				System.out.println("myMoney = " + myMoney + "원");
				System.out.println("yourMoney = " + yourMoney + "원");
			}
			else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}

	}
}
