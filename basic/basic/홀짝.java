package basic;

import java.util.Random;
import java.util.Scanner;

//소요시간 : 2분;
public class 홀짝 {	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int number = ran.nextInt(100)+1;
		
		System.out.println(number);
		
		System.out.println("1.홀수");
		System.out.println("2.짝수");

		System.out.print("번호를 선택하세요 : ");
		int choice = scan.nextInt();
		
		
		if(choice==1) {
			if(number%2==1) {
				System.out.println("정답!");
			}else {
				System.out.println("오답!");
			}
		}else if(choice==2) {
			if(number%2==0) {
				System.out.println("정답!");
			}else {
				System.out.println("오답!");
			}			
		}		
	}
}
