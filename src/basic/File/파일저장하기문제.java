package basic.File;

import java.io.FileWriter;

public class 파일저장하기문제 {
	public static void main(String[] args) {
		
		String[] names = {"김철수", "이만수", "이영희"};
		int[]     ages = {	   20,     30,     40};
		
		String fileName = "fileTest01.txt";
		
		String data = "";
		
		int size = names.length;
		
		for(int i=0 ;i <size ;i++){
			data += names[i];
			data += "/";
			data += ages[i];
			if(1!=size-1) {
				data += ",";
			}
		}
		System.out.println(data);
		

		FileWriter fw = null;
		
		try {
			fw = new FileWriter(fileName);
			fw.write(data);
			fw.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
