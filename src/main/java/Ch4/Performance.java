package Ch4;

/*
 * 表演类 是逻辑类
 * 其中perform方法被代理类调用执行切面方法
 * 完全看不到切面痕迹
 * */
public interface Performance {
	public void perform();
}
