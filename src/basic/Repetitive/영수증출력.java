package basic.Repetitive;

import java.util.Scanner;

//15-22
public class 영수증출력 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;

		int num1 =0;
		int num2 =0;
		int num3 =0;

		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
			
		int i=0; 
		
		while(i<=5) {
		
			
			System.out.println("메뉴를 선택하세요.");
			int sel = scan.nextInt();
			
			if(sel==1) {
				num1+=1;
			}else if(sel==2) {
				num2+=2;
			}else if(sel==2) {
				num3+=1;
			}
			
			i+=1;
		}
		
		int tot = price1*num1 + price2*num2 + price3*num3;
		
		System.out.println("총 금액은"+tot+"원 입니다.");
		System.out.println("금액을 입력해주세요.");
		int money =scan.nextInt();
		
		int charge =money-tot;

		if(charge>=0) {
			System.out.println("=== 롯데리아 영수증===");
			System.out.println("1.불고기 버거 : " + num1 + "개");
			System.out.println("2.새우    버거 : " + num2 + "개");
			System.out.println("3.콜         라 : " + num3 + "개");
			System.out.println("4.금         액: " + tot + "원");
			System.out.println("5.잔         돈 : " + charge + "원");
		}else {
			System.out.println("현금이 부족합니다. ");
		}
		
	}
}
