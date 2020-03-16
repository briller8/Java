package basic.Repetitive;

import java.util.Scanner;

//소요시간 : 5분;
public class 베스킨라빈스31 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int p1 = 0;
		int p2 = 0;
		
		int br = 0;
		int turn = 0;
		
		
		boolean run =true;
		
		while(run) {
			
			if(turn%2==0) {
				System.out.println("p1님 1-3의 숫자를 입력하세요.");
				p1=scan.nextInt();
				
				br=br+p1;
				turn+=1;
			}else if(turn%2==1) {
				System.out.println("p2님 1-3의 숫자를 입력하세요.");
				p2=scan.nextInt();
				
				br=br+p2;
				turn+=1;
			}
			System.out.println("br="+br);
			
			if(br>=31) {
				if(turn%2==0) {
					System.out.println("p1님 승");									
				}else if(turn%2==0) {
					System.out.println("p2님 승");					
				}
				run = false;
				System.out.println("게임 종료!");
			}
		}
		

		

	}
}
