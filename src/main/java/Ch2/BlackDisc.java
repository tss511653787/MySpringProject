package Ch2;

import org.springframework.stereotype.Component;

//@Component(不需要自动装配)
public class BlackDisc implements CompactDisc {
	private String title;
	private String artist;

	public BlackDisc(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing" + title + " by " + artist);
	}

}
