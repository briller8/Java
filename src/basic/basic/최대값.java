package basic.basic;

import java.util.Scanner;

//소요시간 : 4분;
public class 최대값 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자1을 입력하세요.");
		int num1 = scan.nextInt();
		System.out.println("숫자2을 입력하세요.");
		int num2 = scan.nextInt();
		System.out.println("숫자3을 입력하세요.");
		int num3 = scan.nextInt();
		
		int maxNum = num1;
		if(maxNum<num2){
			maxNum=num2;
		}
		if(maxNum<num3){
			maxNum=num3;
		}
		
		System.out.println("최대값 : "+maxNum);
	}
}

