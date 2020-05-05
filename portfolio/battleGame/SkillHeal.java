package battleGame;

import java.util.Random;
import java.util.Vector;

public class SkillHeal extends Skill{
	String info = "ü���� �������� �Ʊ��� ü���� ȸ���մϴ�.";
	int skillPower;
	@Override
	void skill(Unit unit) {
		Vector<Unit> playerList = UnitManager.instance.playerList;
		Random ran = GameManager.instance.ran;
		skillPower = ran.nextInt(25) + 25;
		int minHp = 100;
		Unit healUnit = null;
		for(Unit player : playerList) {
			if(player.isDead == false) {
				if(minHp > player.currentHp) {
					minHp = player.currentHp;
					healUnit = player;
				}
			}
		}		
		if(healUnit != null) {
			System.out.println(info);
			healUnit.currentHp += skillPower;
			System.out.printf("[msg] %s �� %s �� ü���� %d ȸ���մϴ�.",
			                    unit.name , healUnit.name , skillPower);
			System.out.println();
		}
	}
}
