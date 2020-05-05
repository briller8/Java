package basic;

import java.util.Random;
import java.util.Scanner;

//소요시간 : 3분;
public class 코인 {
	public static void main(String[] args) {

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int coin = ran.nextInt(2);

		System.out.println("동전의 면을 선택하세요. 1)앞면, 2) 뒷면");
		int myAnswer = scan.nextInt();

		if(coin==0){
			System.out.println("앞면");
		}
		if(coin==1){
			System.out.println("뒷면");
		}

		if(myAnswer==coin){
			System.out.println("정답!");
		}else{
			System.out.println("땡!");
		}
	}
}
