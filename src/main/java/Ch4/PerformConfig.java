package Ch4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/*
 * 配置类
 * */
@Configuration
// 激活切面代理
@EnableAspectJAutoProxy
@ComponentScan
public class PerformConfig {

	@Bean
	public Audience setauAudience() {
		return new Audience();
	}

	@Bean
	public ErRenZhuan seterErRenZhuan() {
		return new ErRenZhuan();
	}

}
