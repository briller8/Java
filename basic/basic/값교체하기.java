package basic;

//소요시간 : 1분;
public class 값교체하기 {
	public static void main(String[] args) {
		// x와 y의 값 교체하기
		int x = 10;
		int y = 20;
		
		int temp = x;
		x = y ;
		y = temp;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}
}
