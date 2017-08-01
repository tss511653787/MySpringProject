package Ch2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/*
 * 使用Configuration注解标记当前类是一个配置类 Spring会在当前类 所在的包以及子包中进行扫描带有@Component注解的类进行装配
 */
@Configuration
// @ComponentScan
public class CDPlayerConfig {
	// 注入一个默认名字的SgtPeppers对象
	private static String cccc = "ccc";

	@Bean(name = "compactDisc")
	public CompactDisc SgtPeppers() {
		// 构造器方式注入
		return new SgtPeppers();
	}

	@Bean
	@Conditional(CDplayerConditon.class)
	public MediaPlayer CDPlayer(CompactDisc compactDisc) {
		// setter方式注入
		CDPlayer cdp = new CDPlayer();
		cdp.setCd(compactDisc);
		return cdp;
	}

}
