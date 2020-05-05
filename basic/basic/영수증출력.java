package basic;

import java.util.Scanner;

//소요시간 : 3분;
public class 영수증출력 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;

		while(run){
			System.out.println("=== 롯데리아 ===");
			System.out.println("1.불고기 버거 : " + price1 + "원");
			System.out.println("2.새우    버거 : " + price2 + "원");
			System.out.println("3.콜         라 : " + price3 + "원");
			
			System.out.println("메뉴를 선택하세요.");
			int sel = nextInt();

			System.out.println("현금을 입력하세요.");
			int money = nextInt();

			int change =0;
			if(sel==1){
					change = money -price1;
			}else if(sel==2){
					change = money -price2;			
			}else if(sel==3){
					change = money -price3;		
			}
			
			if(change>=0){
				System.out.println("잔돈"+change+"원");			
			}else{
				System.out.println("현금이 부족합니다.");	
			}
		
		}
		
	}
}
