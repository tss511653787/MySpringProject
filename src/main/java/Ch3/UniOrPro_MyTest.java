package Ch3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Ch2.BlankDisc;

public class UniOrPro_MyTest {

	public static void main(String[] args) {
		/*
		 * 使用config配置类进行装备需要使用AnnotationConfigApplicationContext来实例化上下文
		 */
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(
				UniOrProToConfig.class);
		Notepad n1 = context.getBean(Notepad.class);
		Notepad n2 = context.getBean(Notepad.class);
		System.out.println(n1 == n2);
		UniqueThing u1 = context.getBean(UniqueThing.class);
		UniqueThing u2 = context.getBean(UniqueThing.class);
		System.out.println(u1 == u2);
		/*
		 * 从property文件中运行时注入参数Test
		 */
		BlankDisc jayDisc = context.getBean(BlankDisc.class);
		System.out.println(jayDisc.getTitle() + " " + jayDisc.getArtist());

		ApplicationContext xmlcontext = new ClassPathXmlApplicationContext(
				"Ch3/scoped-beans.xml");
		BlankDiscDefaultValue blankDiscDefaultValue = xmlcontext
				.getBean(BlankDiscDefaultValue.class);
		System.out.println(blankDiscDefaultValue.getArtist() + " "
				+ blankDiscDefaultValue.getTitle());

	}

}
