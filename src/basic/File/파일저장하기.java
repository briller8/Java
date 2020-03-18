package basic.File;

import java.io.FileWriter;

public class 파일저장하기 {
	public static void main(String[] args) {
		
		String fileName = "ex01.txt";
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(fileName);
			fw.write("3월 18일 파일 저장하기 연습문제");
			fw.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
