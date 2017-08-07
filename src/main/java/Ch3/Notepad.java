package Ch3;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * 每次都是新创配一个对象进行依赖注入
 */
public class Notepad {
	// the details of this class are inconsequential to this example
	private String cpu;

	public Notepad() {
		super();
	}

	public Notepad(String cpu) {
		super();
		this.cpu = cpu;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

}
