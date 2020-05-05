package gameBattle;

import java.util.Random;
import java.util.Vector;

public class SkillFireBall extends Skill {
	String info = "적전체에게 파이어볼로 공격합니다.";
	int skillPower;
	@Override
	void skill(Unit unit) {
		System.out.println(info);
		Vector<Unit> monsterList = UnitManager.instance.monsterList;
		Random ran = GameManager.instance.ran;
		skillPower = ran.nextInt(25)+25;
		for(Unit mon : monsterList) {
			if(mon.isDead==false) {
				unit.attack(mon);
			}
		}
	}
}
