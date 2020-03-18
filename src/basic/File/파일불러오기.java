package basic.File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class 파일불러오기 {
	public static void main(String[] args) {
		
		Stirng FileName = "ex01.txt";
		
		File file  = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		
		if(file.exists()) {
			try {
				fr= new FileReader(file);
				br = new BuuferedReader(fr);
				
				String data = br.readLine();
				System.out.println(data);
				fr.close();
				br.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
