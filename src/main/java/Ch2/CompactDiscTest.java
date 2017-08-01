package Ch2;

import static org.junit.Assert.*;

import org.apache.commons.logging.Log;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;

/*
 * 写一个Junit测试来测试CompactDisc类是否生成了bean
 * 验证自动装配
 * */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CompactDiscTest {
	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	@Autowired
	CompactDisc cd;
	@Autowired
	private CDPlayer player;

	@Test
	public void cdShouldNotNull() {
		assertNotNull(cd);
	}

	@Test
	public void play() {
		player.play();
		assertEquals(
				"Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n",
				log.getLog());
	}
}
