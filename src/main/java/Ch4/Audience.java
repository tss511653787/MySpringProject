package Ch4;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/*
 * Audience类 是一个切面类 同时也是一个普通的POJO
 * 如果javaConfig类不激活自动切面代理则依然可以用作普通的POJO进行装配
 * */
@Aspect
public class Audience {
	/*
	 * @Pointcut用来定义一个切面类中重复的切点 好处是直接可以使用依附类performance()来代替节点表达式
	 */
	@Pointcut("execution(** Ch4.Performance.perform(..))")
	public void performance() {
	}

	/*
	 * 通知方法
	 */
	@Before("performance()")
	public void silenceCellPhones() {
		System.out.println("观众手机静音");
	}

	@Before("performance()")
	public void takeSeats() {
		System.out.println("观众就坐");
	}

	@AfterReturning("performance()")
	public void applause() {
		System.out.println("掌声响起来");
	}

	@AfterThrowing("performance()")
	public void demandRefund() {
		System.out.println("给予鼓励");
	}
}
