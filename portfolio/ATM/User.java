package ATM;

public class User {
	String name = "";
	String pw = "";
	Account acc[] = null;
	int accCount = 0;
	
	void printAccount() {
		System.out.println(name);
		for(int i = 0; i < accCount; i++) {
			acc[i].print();
		}	
	}
}
