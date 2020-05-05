package Array;

import java.util.Scanner;

//소요시간 : 6분;
public class 학생성적관리프로그램_2 {
	private void mian() {
	
		Scanner scan = new Scanner(System.in);
		
		// 인덱스            0   1   2   3   4
		int[] arr = {87, 11, 45, 98, 23};
		
		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스 입력 : 1	성적 : 11점
		System.out.println("인덱스를 입력하세요.");
		int idx =scan.nextInt();
		
		System.out.println("인덱스 :" +idx+	"성적 : "+arr[idx]+"점");
		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11		인덱스 : 1
		
		System.out.println("성적을 입력하세요.");
		int score =scan.nextInt();
		
		for(int i = 0; i<arr.length ;i++) {
			if(score==arr[i]) {
				idx=i;
			}
		}
		
		System.out.println("성적 : "+arr[idx]+"점 : 인덱스 :" +idx);		
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003	성적 : 45점
		
		System.out.println("학번을 입력하세요.");
		int hakbun =scan.nextInt();

		int check=0; 
		for(int i = 0; i<hakbuns.length ;i++) {
			if(hakbun==hakbuns[i]) {
				check=i;
			}
		}
		
		System.out.println(" 학번 : "+hakbun+" : 성적 :" +scores[check]);		

	}
}
