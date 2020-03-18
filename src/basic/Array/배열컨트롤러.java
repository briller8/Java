package basic.Array;

import java.util.Scanner;

public class 배열컨트롤러 {
	private void mian() {
		
		Scanner scan = new Scanner(System.in);
		
		int[] score = null;
		int count = 0;
		
		while(true) {
			
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(값)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(count==0) {
					score = new int [count+1];
				}else if(count>0) {
					int[] temp = score;
					score = new int[count+1];
					
					for(int i =0;i<count;i++) {
						score[i]=temp[i];
					}
					temp = null;
				}
				System.out.println("추가성적 입력: ");
				int data = scan.nextInt();
				
				score[count] = data;
				count+=1;
			else if(sel == 2) {
				System.out.println("삭제 인덱스 입력: ");
				int idx = scan.nextInt();
				
				if(count-1<idx||idx<0) {
					System.out.println("해당위치는 삭제할 수 없습니다.");
					continue;
				}
				
				if(count==1) {
					score=null;
				}else if(count>1) {
					int[] temp = score;
					score = new int[count-1];
					
					for(int i=0; i<idx;i++) {
						score[i]=temp[i];
					}
					for(int i =idx ;i<count-1 ;i++) {
						score[i]=temp[i+1];
					}
					temp=null;
				}
				
				count-=1;
			}
			else if(sel == 3) {
				System.out.println("삭제 값 입력 : ");
				int delData =scan.nextInt();
				
				int delIdx=-1;
				for(int i=0; i<count;i++) {
					if(delData==score[i]) {
						delIdx=i;
					}
				}
				
				if(delIdx==-1) {
					System.out.println("삭제할 값이 없습니다.");
					continue;
				}
				if(count==1) {
					score=null;
				}else if(count>1) {
					int[] temp = score;
					score = new int[count-1];
					
					int j=0;
					for(int i=0; i<count;i++) {
						if(i!=delIdx) {
							score[j]=temp[i];
							j+=1;
						}
					}
					temp=null;
				}
				
				count-=1;				
			}
			else if(sel == 4) {
				System.out.println("삽입 인덱스 입력");
				int insertIdx = scan.nextInt();
				
				if(count<insertIdx||insertIdx<0) {
					System.out.println("해당위치에는 삽입할 수 없습니다.");
					continue;
				}
				
				System.out.println("삽입 값 입력 :");
				int insertData = scan.nextInt();
				
				if(count==0) {
					score = new int[count+1];
				}else if(count>0) {
					int[] temp = score;
					score = new int[count+1];
					
					int j=0; 
					for(int i=0; i<count+1;i++) {
						if(i!=insertIdx) {
							score[i]=temp[j];
							j+=1;
						}
					}
					temp = null;
				}
				
				score[insertIdx]=insertData;
				count+=1;
			
			}
			else if(sel == 0) {
				break;
			}
		}
	}
}
