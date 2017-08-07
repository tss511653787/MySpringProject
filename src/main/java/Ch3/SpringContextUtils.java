package Ch3;

import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/*
 * 写一个工具类实现ApplicationContextAware接口,并将这个加入到spring的容器
 * */
public class SpringContextUtils implements ApplicationContextAware {
	private static ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext = applicationContext;
	}

	/**
	 * 获取applicationContext对象
	 * 
	 * @return
	 */
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	/**
	 * 根据bean的id来查找对象
	 * 
	 * @param id
	 * @return
	 */
	public static Object getBeanById(String id) {
		return applicationContext.getBean(id);
	}

	/**
	 * 根据bean的class来查找对象
	 * 
	 * @param c
	 * @return
	 */
	public static Object getBeanByClass(Class c) {
		return applicationContext.getBean(c);
	}

	/**
	 * 根据bean的class来查找所有的对象(包括子类)
	 * 
	 * @param c
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Map getBeansByClass(Class c) {
		return applicationContext.getBeansOfType(c);
	}
}
