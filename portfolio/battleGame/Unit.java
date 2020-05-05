package battleGame;

public class Unit {
	String name;
	int currentHp;
	int maxHp;
	int power;
	boolean isDead;
	public Unit(String name, int maxHp, int power) {
		super();
		this.name = name;
		this.currentHp = maxHp;
		this.maxHp = maxHp;
		this.power = power;
		isDead = false;
	}
	void printUnit() {
		System.out.printf("[�̸� : %s][ü�� : %d/%d][���ݷ� : %d]"
				, name , currentHp , maxHp , power);
		System.out.println();
	}
	void attack(Unit unit) {
		unit.currentHp -= this.power;
		System.out.printf("[msg] %s �� %s ���� ������ %d �� �����ϴ�." ,name , unit.name , power );
		System.out.println();
		if(unit.currentHp <= 0) {
			unit.currentHp = 0;
			unit.isDead = true;
			System.out.printf("[msg] %s �� ����մϴ�." ,unit.name);
			System.out.println();
		}
	}
}
