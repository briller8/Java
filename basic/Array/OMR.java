package Array;

import java.util.Random;
//소요시간 : 7분;
public class OMR {
	public static void main(String[] args) {
		
		int[] answer = {1, 3, 4, 2, 5};
		int[] hgd = new int[5];
		
		int cnt =0;
		
		Random ran = new Random();

		System.out.println("정답지");
		for(int i=0; i<answer.length;i++) {
			System.out.print(answer[i]+" ");
		}

		
		System.out.println("답안지");
		for(int i=0; i<hgd.length;i++) {
			hgd[i]=ran.nextInt(5)+1;
			System.out.print(hgd[i]+" ");
		}
		
		System.out.println("정오표");
		for(int i=0; i<hgd.length ;i++) {
			if(hgd[i]==answer[i]) {
				System.out.print("o");
				cnt+=1;
			}else {
				System.out.print
				("x");
			}
		}
		System.out.println("성적 "+cnt*20);	

	}
}
