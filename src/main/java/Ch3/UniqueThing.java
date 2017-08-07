package Ch3;

import org.springframework.stereotype.Component;

/*
 * 默认的装配是单例
 */
public class UniqueThing {
	// the details of this class are inconsequential to this example
	private String id;

	public UniqueThing() {
		super();
	}

	public UniqueThing(String id) {
		super();
		this.id = id;
	}

}
