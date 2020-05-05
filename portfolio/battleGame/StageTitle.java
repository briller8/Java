package battleGame;

public class StageTitle extends Stage{
	@Override
	void init() {
		
	}

	@Override
	boolean update() {
		System.out.println("=====[Ÿ��Ʋ]=====");
		System.out.println("[1.����] [2.����]");
		int select = GameManager.instance.scan.nextInt();
		if(select == 1) {
			GameManager.instance.changeStage("Lobby");			
		}else {
			GameManager.instance.changeStage("");			
		}
		return false;
		
	}

}
