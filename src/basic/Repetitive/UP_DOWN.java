package basic.Repetitive;

import java.util.Random;
import java.util.Scanner;

public class UP_DOWN {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int rNum=ran.nextInt(100)+1;
		int score=100;
		int cnt=0;
		
		boolean run =true;
		
		while(run) {
			System.out.println("숫자를 입력하세요");
			int num = scan.nextInt();
			
			if(num<rNum) {
				System.out.println("UP!");
				cnt+=1;
			}else if(num<rNum) {
				System.out.println("DOWN!");
				cnt+=1;
			}else if(num==rNum) {
				System.out.println("정답!");
				run = false;
			}
		}
		score=score-cnt*5;
		System.out.println(score+"점입니다.");	

	}
}
