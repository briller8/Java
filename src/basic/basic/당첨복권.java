package basic.basic;

import java.util.Random;

//소요시간 : 2분;
public class 당첨복권 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int rNum = ran.nextInt(10);
	
		if(rNum<3) {
			System.out.println("당첨!");
		}else {
			System.out.println("꽝!");
		}
		
	}
}
