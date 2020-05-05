package basic;

import java.util.Random;
import java.util.Scanner;

public class 연산자기호맞추기 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int x = ran.nextInt(10)+1;
		int y = ran.nextInt(10)+2;
		int answer = ran.nextInt(4);
		
		int z=0;
		if(answer==1) {
			z=x+y;
		}else if(answer==2) {
			z=x-y;
		}else if(answer==3) {
			z=x*y;
		}else if(answer==4) {
			z=x%y;
		}

		System.out.println("중간에 들어갈 연산자를 입력하세요.");
		System.out.println(x+"?"+y +"="+ answer);
		System.out.println("1)+ 2)- 3)X 4)%");
		
		int myAnswer=scan.nextInt();
		
		if(answer==myAnswer) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
		
	}
}
