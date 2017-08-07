package Ch4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * PerformanceTest测试类
 * */
public class PerformanceTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				PerformConfig.class);
		Performance performance = context.getBean(Performance.class);
		performance.perform();

	}

}
