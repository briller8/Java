package basic.basic;

import java.util.Scanner;

//소요시간 : 6분;
public class ATM_1단계 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		
		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");


		System.out.println("계좌번호를 입력하세요!");
		int acc = scan.nextInt();
		
		if(acc==yourAcc) {
			System.out.println("이체할 금액을 입력하세요.");
			int money= scan.nextInt();
			
			if(money<myMoney) {
				System.out.println("잔액이 부족합니다.");
			}else if(money>=myMoney) {
				
				myMoney= myMoney - money;
				yourMoney= yourMoney - money;
				
				System.out.println("이체가 완료되었습니다.");

				System.out.println("myMoney = " + myMoney + "원");
				System.out.println("yourMoney = " + yourMoney + "원");

			}
		}else {
			System.out.println("계좌번호를 확인하세요!");
		}
		


	}
}
