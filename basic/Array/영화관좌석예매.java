package Array;

import java.util.Scanner;

//소요시간 : 43
public class 영화관좌석예매 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] seat = new int[7];
		
		boolean run = true;
		while(run) {
			System.out.println("=메가 영화관=");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			int check=0;
			int cnt=0;
			if(sel == 1) {
				
				System.out.println("좌석 선택 : ");
				for(int i=0; i<seat.length;i++) {
					seat[i]=0;
					System.out.print(seat[i]+" ");
				}
				
				System.out.println("o인 좌석을 선택하세요.");
				int idx = scan.nextInt();
				
				if(idx) {
					
				}else{
					System.out.println("해당 좌석은 예매할 수 없습니다. ");
				}
			}
			else if(sel == 2) {
				run = false;
			}
		}
	}
}
