package Ch2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;

	public CDPlayer() {
	}

	@Autowired
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		cd.play();
	}

	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}
}
