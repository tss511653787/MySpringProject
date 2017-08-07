package Ch3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.stereotype.Component;

import Ch2.CompactDisc;

/*
 * 使用自动注入
 * */
@Component("blankDiscDefaultValue")
// xml中装配
public class BlankDiscDefaultValue implements CompactDisc {
	/*
	 * 使用自动基于XML的自动装配 动态注入属性文件中的值
	 */
	@Value("${BlankDisc.title}")
	public String title;
	@Value("${BlankDisc.artist}")
	public String artist;
	public List<String> tracks;

	// 使用@Value注解需要装配一个paPropertySourcesPlaceholderConfigure bean
	@Bean
	public static PropertySourcesPlaceholderConfigurer paPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	public BlankDiscDefaultValue() {
		super();
	}

	public BlankDiscDefaultValue(String title, String artist,
			List<String> tracks) {
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
