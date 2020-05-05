package basic;

import java.util.Scanner;


public class 지하철요금계산 {
	private void mian() {
		// TODO Auto-generated method stub

	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정거장 수를 입력하세요.");
		int station = scan.nextInt();
		
		int fee=0;
		
		if(1<=station&&station<=5) {
			fee=500;
		}else if(6<=station&&station<=10) {
			fee=500;
		}else {
			if(station%2==1) {
				fee=600;
				int add=(station-10)/2*50;
				fee= fee+add+50;
			}else if(station%2==0) {
				fee=600;
				int add=(station-10)/2*50;
				fee=fee+add;
			}
		}
		
		System.out.println("요금"+fee+"원");

	}
}