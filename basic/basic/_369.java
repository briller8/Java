package basic;

import java.util.Random;

//소요시간 : 5분;
public class _369 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int rNum=ran.nextInt(50)+1;
		
		int x = rNum/10;
		int y = rNum%10;
		
		int cnt=0;
		if(x==3 || x==6 || x==9) {
			cnt = cnt+1;
		}
		if(y==3 || y==6 || y==9) {
			cnt = cnt+1;
		}
		
		if(cnt==2) {
			System.out.println("짝짝");
		}if(cnt==1) {
			System.out.println("짝");
		}else {
			System.out.println(rNum);
		}
	}
}
