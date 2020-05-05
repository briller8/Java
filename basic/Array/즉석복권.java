package Array;

import java.util.Scanner;
//소요시간 : 3분;
public class 즉석복권 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		

		int[] lotto1 = {0, 0, 7, 7, 7, 0, 0, 0};
		int[] lotto2 = {7, 0, 7, 7, 0, 0, 0, 0};
		int[] lotto3 = {7, 0, 7, 7, 7, 0, 7, 0};
		
		boolean run = true;
		while(run) {
			
			System.out.println("[1]번복권 결과확인");
			System.out.println("[2]번복권 결과확인");
			System.out.println("[3]번복권 결과확인");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			int cnt=0;
			if(sel == 1) { 
				for(int i=0; i<lotto1.length ;i++) {
					if(lotto1[i]==lotto1[i+1]) {
						cnt+=1;
					}
				}
				if(cnt==2) {
					System.out.println("당첨!");
				}else {
					System.out.println("꽝!");
				}
			}
			else if(sel == 2) {
				for(int i=0; i<lotto2.length ;i++) {
					if(lotto2[i]==lotto2[i+1]) {
						cnt+=1;
					}
				}
				if(cnt==2) {
					System.out.println("당첨!");
				}else {
					System.out.println("꽝!");
				}
				
			}
			else if(sel == 3) {
				for(int i=0; i<lotto3.length ;i++) {
					if(lotto3[i]==lotto3[i+1]) {
						cnt+=1;
					}
				}
				if(cnt==2) {
					System.out.println("당첨!");
				}else {
					System.out.println("꽝!");
				}
				
			}
		}

	}
}
