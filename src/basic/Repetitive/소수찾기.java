package basic.Repetitive;

import java.util.Scanner;

//소요시간 :4분;
public class 소수찾기 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int num=scan.nextInt();
		
		int cnt=0;
		int i=0;
		while(i<=num) {
			
			if(num%i==0) {
				cnt+=1;
			}
			i+=1;
		}
		if(cnt==2) {
			System.out.println("소수이다.");
		}else {
			System.out.println("소수가 아니다.");
		}
		
	}
}
