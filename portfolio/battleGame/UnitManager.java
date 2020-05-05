package battleGame;
import java.util.Vector;
public class UnitManager {
	static UnitManager instance = new UnitManager();
	Vector<Unit> playerList = new Vector<>();
	Vector<Unit> monsterList = new Vector<>();
	void init() {
		setPlayer();
	}
	void setPlayer() {	
		playerList.clear();
		playerList.add(new UnitPlayer("������" , 100,  30 ,
				new SkillPowerAttack()));
		playerList.add(new UnitPlayer("������" , 80,  20 ,
				new SkillFireBall()));
		playerList.add(new UnitPlayer("����" ,  60,  10, 
				new SkillHeal()));
	}
	void setMonster() {
		monsterList.clear();
		monsterList.add(new Monster("����" , 200,  5));
		monsterList.add(new Monster("����" , 200,  5));
		monsterList.add(new Monster("����" , 150,  7));
		monsterList.add(new Monster("����" , 150,  7));
	}
	void printPlayer() {
		System.out.println("=====[�÷��̾�]=====");
		for(Unit player : playerList) {
			player.printUnit();
		}
		System.out.println("==================");
	}
	void printMonster() {
		System.out.println("=====[����]=====");
		for(Unit mon : monsterList) {
			mon.printUnit();
		}
		System.out.println("==================");
	}
	
	
}
