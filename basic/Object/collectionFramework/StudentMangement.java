package Object.collectionFramework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Vector;

class Student{
	String id;
	String pw;
	
	public void set_data(String i ,String p) {
		id = i;
		pw =p ;
	}
	
	public void print_data() {
		System.out.println("이름 : "+id +"비밀번호 : "+pw);
	}
}

class Manager{
	Vector<Student> vec = new Vector<Student>();
	
	public void add_student(Student st) {
		vec.add(st);
	}
	Student remove_Student(int index) {
		Student del_st = vec.get(index);
		vec.remove(index);
		return del_st;
	}
	int check_id(Student st) {
		int check = -1;
		for(int i=0; i<vec.size(); i++){
			if(vec.get(i).id.equals(st.id)) {
				check = i;
				break;
			}
		}
		return check;
	}
	void print_student() {
		for(int i=0; i<vec.size(); i++) {
			vec.get(i).print_data();
		}
	}
	String out_data() {
		String data = "";
		int count = vec.size();
		if(count==0) {
			return data;
		}
		data += count;
		data += "\n";
		for(int i=0; i<count;i++) {
			data += vec.get(i).id;
			data += ",";
			data += vec.get(i).pw;
			if(count-1!=i) {
				data += "\n";				
			}
		}
		return data;
	}
	public void sort_data() {
		for(int i = 0; i<vec.size(); i++) {
			Student s1 = vec.get(i);
			for(int j=0; j<vec.size(); j++) {
				Student s2 = vec.get(j);
				if(s1.id.compareTo(s2.id)>0) {
					Student temp = vec.get(i);
					vec.set(i, vec.get(j));
					vec.set(j, temp);					
				}
			}
		}
	}
	public void load_student(Vector<Student>temp) {
		vec = temp;
	}
	int get_size() {
		return vec.size();
	}
}
public class StudentMangement {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Manager manager = new Manager();
		boolean run = true;
		while(run) {
			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드");
			int sel = scan.nextInt();
			
			if(sel==1) {
				Student temp = new Student();
				System.out.println("id를 입력하세요.");
				temp.id = scan.next();
				int check = manager.check_id(temp);
				if(check == -1) {
					System.out.println("pw를 입력하세요.");
					temp.pw = scan.next();
					manager.add_student(temp);
					System.out.println(temp.id+"님 가입을 환영합니다.");
				}else {
					System.out.println("중복아이디 입니다.");
				}
			}else if(sel==2) {
				manager.print_student();
				Student temp = new Student();
				System.out.println("탈퇴 id를 입력하세요.");
				temp.id = scan.next();
				int check = manager.check_id(temp);
				if(check==-1) {
					System.out.println("없는 아이디입니다.");
				}else {
					Student del_st = manager.remove_Student(check);
					System.out.println(del_st.id+"님 탈퇴 되었습니다.");
				}
			}else if (sel==3) {
				manager.sort_data();
				manager.print_student();
			}else if(sel==4) {
				manager.print_student();
			}else if(sel==5) {
				if(manager.get_size()==0) return;
				try {
					FileWriter fw = new FileWriter("");
					String data= manager.out_data();
					if(!data.equals("")) {
						fw.write(data);
						System.out.println(data);
					}
					fw.close();
				}catch(Exception e){e.printStackTrace();}
			}else if(sel==6) {
				try {
					File file = new File("student_manager_vec.txt");
					if(file.exists()){
						FileReader fr = new FileReader(file);
						BufferedReader br = new BufferedReader(fr);
						String line = br.readLine();
						int count = Integer.parseInt(line);
						Vector<Student> vec = new Vector<Student>();
						for(int i = 0; i<count;i++) {
							Student temp = new Student();
							line = br.readLine();
							String value[] = line.split(",");
							temp.id = value[0];
							temp.pw = value[1];
							vec.add(temp);
						}
						fr.close();
						br.close();
						manager.load_student(vec);
					}
					manager.print_student();
				}catch(Exception e) {
						e.printStackTrace();
				}
			}
		}
	}
}
