package Ch3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

import Ch2.BlankDisc;

@Configuration
@PropertySource("Ch3/PropertySourceFile.properties")
public class UniOrProToConfig {
	/*
	 * 自动注入一个Environment对象来获取配置文件属性
	 */
	@Autowired
	Environment env;

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Notepad setNotpad() {
		return new Notepad();
	}

	@Bean
	public UniqueThing setUniqueThing() {
		return new UniqueThing();
	}

	/*
	 * 运行时从配置文件注入参数
	 */
	@Bean
	public BlankDisc setBlankDisc() {
		return new BlankDisc(env.getProperty("BlankDisc.title"),
				env.getProperty("BlankDisc.artist"));
	}
	
}
