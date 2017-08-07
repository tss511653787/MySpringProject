package Ch2;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*
 * 使用自动注入
 * */
@Component("blankDisc")
// xml中装配
public class BlankDisc implements CompactDisc {
	private String title;
	private String artist;
	private List<String> tracks;

	public BlankDisc() {
	}

	public BlankDisc(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	public BlankDisc(String title, String artist, List<String> tracks) {
		super();
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public List<String> getTracks() {
		return tracks;
	}

	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing" + title + " by " + artist);
		for (String song : tracks) {
			System.out.println(song);
		}
	}

}
