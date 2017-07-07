package app15a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProjectClassTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String[] Paths = new String[] { "app15a/myFirstClass.xml" };
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				Paths);
		Product pro1 = appContext.getBean("featuredProduct", Product.class);
		System.out.println(pro1);
		Product pro2 = appContext.getBean("featuredProduct2", Product.class);
		System.out.println(pro2);
		//
		Employee employee1 = appContext.getBean("employee1", Employee.class);
		System.out.println(employee1.getFirstName() + " "
				+ employee1.getLastName());
		System.out.println(employee1.getHomeAddress());

		Employee employee2 = appContext.getBean("employee2", Employee.class);
		System.out.println(employee2.getFirstName() + " "
				+ employee2.getLastName());
		System.out.println(employee2.getHomeAddress());
	}

}
