package app15b;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightTest {
	public static void main(String[] args) {
		String Xmlpath = "app15b/KnightXMLInjectionTest-context.xml";
		// xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				Xmlpath);
		Knight aKnight = context.getBean("knight", BraveKnight.class);
		aKnight.embarkOnQuest();
	}

}
