package basic;

import java.util.Scanner;

//소요시간 : 8분;
public class ATM_2단계 {
	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		int cash = 20000;  // 입금시 감소  , 출금시 증가
		int balance = 30000; // 입금시 증가 , 출금시 감소 
		int account  = 11111; // 로그인시 사용
		int password  = 1234; // 로그인시 사용 

		System.out.println("===MEGA ATM===");
		System.out.println("1.로그인 2.종료");
		int select = scan.nextInt();
		
		if(select == 1) {
			System.out.println("계좌와 비밀번호를 입력하세요 ");
			 int myAcc =scan.nextInt();
			 int myPw =scan.nextInt();
			 
			 if(myAcc==account&&myPw==password) {
				 System.out.println("1.입금 2.출금 3.조회 ");
				 int sel = scan.nextInt();
				 
				 if(sel==1) {
					 System.out.println("입금할 금액을 입력하세요.");
					 int deposit=scan.nextInt();
					 cash = cash-deposit;
					 balance = balance+deposit;					 
				 }else if(sel==2) {
					 System.out.println("출금할 금액을 입력하세요.");
					 int withdraw=scan.nextInt();
					 cash = cash+withdraw;
					 balance = balance-withdraw;			 
					 
				 }else if(sel==3) {
					 System.out.println("조회 :"+balance+"원");
				 }
			}
			else {
				System.out.println("아이디와 패스워드를 확인해주세요.");
			}
		}
		else if(select == 2) {
			System.out.println("종료");
		}	
	}	
}
