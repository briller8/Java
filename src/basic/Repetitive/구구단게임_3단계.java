package basic.Repetitive;

import java.util.Random;
import java.util.Scanner;

public class 구구단게임_3단계 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int x=ran.nextInt(9)+1;
		int y=ran.nextInt(9)+1;
		int answer= x*y; 
				
		int cnt=0;
		for(int i=0; i<=5;i++) {
			System.out.println(x+"X"+y+"="+answer);
			
			System.out.println("정답을 입력하세요.");
			int myAnswer = scan.nextInt();
			
			if(myAnswer==answer) {
				cnt+=1;
			}
			i+=1;
		}
		int score=cnt*20;
		System.out.println(score+"점입니다.");
	}
}
