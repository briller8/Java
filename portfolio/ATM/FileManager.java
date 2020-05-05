package ATM;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileManager {
	
	static String fileName = "data_0320_.txt";
	static File file = new File(fileName);

	void save() {
		
		String data = "";
		
		FileWriter fw =null;
		
		data+=ATM.userManager.userCount;
		data+="/";
		for(int i=0; i<ATM.userManager.userCount;i++) {
			if(ATM.userManager.userCount>0) {
				data+=ATM.userManager.user[i].name;
				data+=",";
				data+=ATM.userManager.user[i].pw;
				data+="/";
				data+=ATM.userManager.user[i].accCount;
				data+="/";
				for(int j=0;j<ATM.userManager.user[i].accCount;j++) {
					data+=ATM.userManager.user[i].acc[j].number;
					data+=",";
					data+=ATM.userManager.user[i].acc[j].money;
					data+="/";
				}
			}
			data+="\n";
		}
		data+="\n";
		data.substring(0,data.length()-1);
		
		try {
			fw = new FileWriter(fileName);
			fw.write(data);
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	void load() {
		String data="";
		
		if(file.exists()) {
			try {
				FileReader fr = null;
				BufferedReader br = null;
				
				String line = br.readLine();
				data+=line;
				data+="\n";
				
				while(true) {
					line = br.readLine();
					if(line==null) {
						break;
					}
					data+=line;
					data+="\n";
				}
				
				String[] info = data.split("/");
				int size = Integer.parseInt(info[0]);
				
				ATM.userManager.userCount=size;
				ATM.userManager.user=new User[size];
				
				for(int i=0; i<size;i++) {
					ATM.userManager.user[i]= new User();
				}
				
				if(size==0) {
					System.out.println("저장할 데이터가 없습니다.");
					return;
				}
				
				for(int i=0;i<size;i++) {
					String[] temp = info[i+1].split("/");
					String[] userList = temp[0].split(",");
					
					ATM.userManager.user[i].name=userList[0];
					ATM.userManager.user[i].pw=userList[1];
					
					ATM.userManager.user[i].accCount=Integer.parseInt(temp[1]);
					if(ATM.userManager.user[i].accCount!=0) {
						ATM.userManager.user[i].acc=new Account[ATM.userManager.user[i].accCount];
						for(int j=0;j<ATM.userManager.user[i].accCount;j++) {
							String[] accValue = temp[j+1].split(",");
							ATM.userManager.user[i].acc[j].number=accValue[0];
							ATM.userManager.user[i].acc[j].money=Integer.parseInt(accValue[1]);
						}
					}
				}
				fr.close();
				br.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
