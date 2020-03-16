package basic.basic;

import java.util.Scanner;

//소요시간 : 2분;
public class 가위바위보 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int com = 1;
		
		System.out.println("가위(0) 바위(1) 보(2)! ");
		int me = scan.nextInt();
		
		if(me==com) {
			System.out.println("비겼다.");
		}else if(me==0) {
			System.out.println("졌다!");
		}else if(me==2) {
			System.out.println("이겼다!!");
		}
		
	}
}
