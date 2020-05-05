package basic;

import java.util.Random;
import java.util.Scanner;

//소요시간 : 3분;
public class 구구단게임 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int num1=ran.nextInt(9)+1;
		int num2=ran.nextInt(9)+1;
		
		System.out.println(num1+"X"+num2+"="+"?");
		
		int answer=num1*num2;
		
		System.out.println("정답을 입력하세요.");
		int me = scan.nextInt();
		
		if(answer==me) {
			System.out.println("정답!");
		}else {
			System.out.println("오답!");
		}
		
	}
}
