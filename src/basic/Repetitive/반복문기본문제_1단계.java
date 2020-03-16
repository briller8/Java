package basic.Repetitive;
//2분;
public class 반복문기본문제_1단계 {
	public static void main(String[] args) {
		
		// 문제1) 1~10까지 반복해 5~9 출력
		// 정답1) 5, 6, 7, 8, 9
		
		for(int i=1;i<10;i++) {
			if(i<=5&&i<10) {
				System.out.println(i+" ");
			}
		}
		
		// 문제2) 10~1까지 반복해 6~3 거꾸로 출력
		// 정답2) 6, 5, 4, 3
		
		for(int i=10;i>1;i--) {
			if(i<=6&&i>=3) {
				System.out.println(i+" ");
			}
		}
		
		// 문제3) 1~10까지 반복해 짝수만 출력
		// 정답3) 2, 4, 6, 8, 10

		for(int i=1;i<10;i++) {
			if(i%2==0) {
				System.out.println(i+" ");
			}
		}

	}
}
