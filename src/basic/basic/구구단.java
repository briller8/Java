package basic.basic;

import java.util.Scanner;

//소요시간 : 3분;
public class 구구단 {
	public static void main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자1을 입력하세요.");
		int num1 =scan.nextInt();
		
		System.out.println("숫자2을 입력하세요.");
		int num2 =scan.nextInt();
		
		int answer = x*y;
		
		System.out.println("숫자를 곱한 값을 입력하세요.");
		int myAnswer =scan.nextInt();
		
		if(answer==myAnswer){
			System.out.println("정답!");		
		}else{
			System.out.println("땡!");
		}
	}
}
