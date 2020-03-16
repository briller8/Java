package basic.Repetitive;

//소요시간 : 7분;
public class _369 {
	public static void main(String[] args) {
		

		int i=0;
		while(i<=50) {
			
			int x=i%100;
			int y=i%100/10;
			
			int cnt=0;
			
			if(x==3||x==6||x==9) {
				cnt+=1;
			}
			if(y==3||y==6||y==9) {
				cnt+=1;
			}
			
			if(cnt==2){
				System.out.println("짝짝");
			}if(cnt==1) {
				System.out.println("짝");				
			}if(cnt<0) {
				System.out.println(i);
			}

			i+=1;
			
		}
	}
}
