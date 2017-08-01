package app15b;

public class BraveKnight implements Knight {

	private Quest quest;
	/*
	 * 骑士类中本不应该注入诗人类 管理诗人类逻辑不是骑士的工作
	 */
	//Minstrel minstrel;

	public BraveKnight(Quest quest) {
		this.quest = quest;
	}

	public void embarkOnQuest() {
		// 诗人对骑士的歌颂
		// minstrel.singBeforeQuest();
		quest.embark();
		// minstrel.singAfterQuest();
	}

}
