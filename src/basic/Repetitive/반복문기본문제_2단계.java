package basic.Repetitive;

public class 반복문기본문제_2단계 {
	public static void main(String[] args) {
		
		// 문제1) 1~5까지의 합 출력
		// 정답 1) 15
		
		int tot=0;
		
		for(int i=1; i<=5;i++) {
			tot=tot+i;
		}
		System.out.println(tot);
		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		// 정답2) 1, 2, 7, 8, 9, 10
		
		for(int i=1; i<=10;i++) {
			if(i<3||i>=7) {
				System.out.println(i+" ");
			}
		}
		
		
		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		// 정답3) 37
		
		tot=0;
		for(int i=1; i<=10;i++) {
			if(i<3||i>=7) {
				tot=tot+i;
			}
		}
		System.out.println(tot);
		
		
		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		// 정답4) 6

		int cnt=0;
		for(int i=1; i<=10;i++) {
			if(i<3||i>=7) {
				cnt+=1;
			}
		}
		System.out.println(cnt);

	}
}
