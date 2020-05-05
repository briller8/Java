package ATM;
import java.util.Scanner;
public class ATM {
	Scanner scan = new Scanner(System.in);
	static UserManager userManager = new UserManager();
	static FileManager fileManager = new FileManager();
	int log = -1;
	void menu() {
		boolean run = true;
		while (run) {
			System.out.println("[MEGA ATM]");
			System.out.println("[1.로그인]\n[2.로그아웃]\n[3.회원가입]\n[4.회원탈퇴]\n[5.저장하기]\n[6.로드하기]\n[0.종료]");
			int sel = scan.nextInt();
			if (sel == 1) {
				login();
			} else if (sel == 2) {
				logout();
			} else if (sel == 3) {
				join();
			} else if (sel == 4) {
				leave();
			} else if(sel == 5) {
				save();
			} else if(sel==6){
				load();
			}else if (sel == 0) {
				run = false;
			}
		}
	}
	void login() {
		log = userManager.logUser();
		if (log != -1) {
			loginMenu();
		}else {
			System.out.println("[메세지] 로그인실패.");
		}
	}
	void join() {	
		userManager.addUser();
	}
	void logout() {
		log = -1;
	}
	void leave() {
		userManager.leave();
	}
	void save() {
		fileManager.save();
	}
	void load() {
		fileManager.load();
	}

	void loginMenu() {
		boolean run = true;
		while (run) {
			System.out.println("[1.계좌생성] [2.계좌삭제] [3.조회] [0.로그아웃]");
			int sel = scan.nextInt();
			if (sel == 1) {
				addAcc();
			} else if (sel == 2) {
				delAcc();
			} else if (sel == 3) {
				showAcc();
			} else if (sel == 0) {
				run = false;
			}
		}
	}
	
	void addAcc() {
		System.out.println("계좌번호 입력 : ");
		String addAcc =scan.next();
		int size = userManager.user[log].accCount;
		
		if(userManager.user[log].acc==null) {
			userManager.user[log].acc= new Account[1];
			userManager.user[log].acc[0]=new Account();
		}else {
			Account[] temp = userManager.user[log].acc;
			
			userManager.user[log].acc = new Account[size+1];
			userManager.user[log].acc[size] = new Account();
			for(int i=0; i<size;i++) {
				userManager.user[log].acc[i]=temp[i];
			}
			temp = null;
		}
		userManager.user[log].acc[size].number=addAcc;
		userManager.user[log].acc[size].money=1000;
		userManager.user[log].accCount+=1;
		System.out.println("계좌가 생성되었습니다.");
	}
	void delAcc() {
		System.out.println("삭제할 계좌를 입력하세요.");
		String delAcc = scan.next();
		
		int size = userManager.user[log].accCount;
		int check =-1;
		for(int i=0; i<userManager.user.length;i++) {
			for(int j=0; j<userManager.user[i].accCount;j++) {
				if(userManager.user[i].acc[j].number.equals(delAcc)) {
					check=j;
				}
			}
		}
		if(check==-1) {
			System.out.println("해당계좌는 존재하지 않습니다. 다시 확인하세요.");
		}else {
			if(size==1) {
				userManager.user[log].acc=null;
			}else if(size>1) {
				Account[] temp = userManager.user[log].acc;
				
				userManager.user[log].acc = new Account[size-1];
				
				for(int i=0; i<check;i++) {
					userManager.user[log].acc[i]= temp[i];
				}
				for(int i=check;i<size-1;i++) {
					userManager.user[log].acc[i]=temp[i+1];
				}
				temp = null;
			}
			userManager.user[log].accCount-=1;
			System.out.println("계좌가 삭제되었습니다.");
		}
	}
	void showAcc() {
		int size = userManager.user[log].accCount;
		
		if(size==0) {
			System.out.println("계좌가 없습니다. 계좌를 생성하세요.");
		}else if(size>0) {
			System.out.println(userManager.user[log].name+"님의 계좌와 금액은 다음과 같습니다.");
			userManager.user[log].printAccount();
		}
	}
}
