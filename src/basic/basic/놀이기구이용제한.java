package basic.basic;

import java.util.Scanner;

//소요시간 : 3분;
public class 놀이기구이용제한 {
	public static void main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키을 입력하세요.");
		int hight = scan.nextInt();
		
		if(hight>=120){
			System.out.println("입장이 가능합니다.");
		}else{
			System.out.println("부모님과 함께 오셨나요? 1)네 2)아니오");
			int answer = scan.nextInt();
			
			if(answer==1){
				System.out.println("입장이 가능합니다.");
			}else{
				System.out.println("입장이 불가능합니다.");
			}
		}
	}

}
