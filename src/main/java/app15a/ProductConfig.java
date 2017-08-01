package app15a;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * @Configuration 标签注解
 * */
@Configuration
public class ProductConfig {
	/*
	 * @Bean 标签注解
	 */
	@Bean
	public Product product() {
		Product pro = new Product();
		pro.setName("abc");
		pro.setDescription("lll");
		pro.setPrice(10.0f);
		return pro;
	}

}
