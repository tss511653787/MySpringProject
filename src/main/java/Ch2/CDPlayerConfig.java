package Ch2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*
 * 使用Configuration注解标记当前类是一个配置类 Spring会在当前类 所在的包以及子包中进行扫描带有@Component注解的类进行装配
 */
@Configuration
@ComponentScan
public class CDPlayerConfig {
	// 注入一个默认名字的SgtPeppers对象
	private static String cccc = "ccc";

	@Bean(name = "SgtPepperDisc")
	/* SgtPeppers设置为首选类 */
	@Primary
	public CompactDisc SgtPeppers() {
		// 构造器方式注入
		return new SgtPeppers();
	}

	@Bean
	/*
	 * 设置一个Condition条件 当满足时进行装配
	 */
	@Conditional(CDplayerConditon.class)
	public MediaPlayer CDPlayer(CompactDisc compactDisc) {
		// setter方式注入
		CDPlayer cdp = new CDPlayer();
		cdp.setCd(compactDisc);
		return cdp;
	}

	@Bean("BeatlesDisc")
	/*
	 * 使用自定义限定注解
	 */
	@BeatlesMusic
	public CompactDisc BeatlesDiscInject() {
		return new SgtPeppers();
	}

}
