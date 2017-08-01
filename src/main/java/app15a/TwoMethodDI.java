package app15a;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Spring的两种依赖注入方式
 * 1、Xml的依赖注入
 * 2、 Java来描述配置
 * */

public class TwoMethodDI {
	/*
	 * test code
	 */
	public static void main(String[] args) {
		String Xmlpath = "app15a/myFirstClass.xml";
		// xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				Xmlpath);
		Product pro1 = context.getBean("featuredProduct", Product.class);
		System.out.println(pro1);
		// Java描述
		AnnotationConfigApplicationContext javaContext = new AnnotationConfigApplicationContext(
				ProductConfig.class);
		Product pro2 = javaContext.getBean(Product.class);
		System.out.println(pro2);
	}
}
