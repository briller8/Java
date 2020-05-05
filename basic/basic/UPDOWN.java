package basic;

import java.util.Scanner;

//소요시간 : 2분;
public class UPDOWN {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int com=8;
		
		System.out.println("숫자를 입력하세요.");
		int me = scan.nextInt();
		
		if(me<com) {
			System.out.println("UP");
		}else if(me==com) {
			System.out.println("BIGGO!");
			
		}else if(me>com) {
			System.out.println("DOWN");
		}
		
	}

}
