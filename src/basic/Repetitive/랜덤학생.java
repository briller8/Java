package basic.Repetitive;

import java.util.Random;

//소요시간 : 8분;
public class 랜덤학생 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int check=0;
		int maxNum=0;
		int cnt=0;
		int tot=0;
		double avg=0.0;
		
		
		for(int i=0; i<=10; i++) {
			
			int num = ran.nextInt(100)+1;
			
			tot=tot+num;

			if(num>=60) {
				cnt+=1;
			}
			
			if(maxNum<num) {
				maxNum=num;
				check=i;
			}
			
			i+=1;
			
			System.out.println("");
		}
		avg=tot/10.0;
		
		System.out.println("전교생 총점"+tot+"/ 평균:"+avg);
		System.out.println("합격생 수"+cnt);
		System.out.println("1등 학생 번호 :"+check+"/ 성적:"+maxNum);
	}
}
