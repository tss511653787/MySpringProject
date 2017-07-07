package neu.edu.tss.Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
		// 1.xml 和2.xml中获取配置注入依赖
		String[] Paths = new String[] { "1.xml", "2.xml" };
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				Paths);
		String str = appContext.getBean("str1", String.class);
	}
}
