package app15b;

import java.io.PrintStream;

/*
 * 一个诗人类 用来在骑士Quest的前后对骑士进行歌颂
 * */

public class Minstrel {

	private PrintStream stream;

	
	public Minstrel() {
		super();
	}

	public Minstrel(PrintStream stream) {
		this.stream = stream;
	}

	/*
	 * quest前歌颂
	 */
	public void singBeforeQuest() {
		stream.println("Fa la la, the knight is so brave!");
	}

	/*
	 * quest后歌颂
	 */
	public void singAfterQuest() {
		stream.println("Tee hee hee, the brave knight "
				+ "did embark on a quest!");
	}

}
