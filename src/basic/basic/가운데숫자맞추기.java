package basic.basic;

import java.util.Random;
import java.util.Scanner;

//소요시간 : 5분;
public class 가운데숫자맞추기 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		
		int rNum = ran.nextInt(100)+150;
		int answer = rNum%100/10;
		
		System.out.println("가운데 숫자를 맞추세요."+rNum);
		int myAnswer=scan.nextInt();
		
		if(answer==myAnswer) {
			System.out.println("정답!");
		}else {
			System.out.println("오답!");
		}
	}
}
