package basic.Repetitive;

import java.util.Scanner;

//소요시간 : 3분;
public class 최대값 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		int maxNum=0;
		for(int i=0; i<4;i++){
			System.out.println("정수를 입력하세요.");
			int num =scan.nextInt();
			
			if(maxNum<num) {
				maxNum=num;
			}
			i+=1;
		}
		System.out.println("최대값 :"+maxNum);
	}
}
