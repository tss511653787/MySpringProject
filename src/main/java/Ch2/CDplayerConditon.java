package Ch2;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/*
 * 定义一个CDplayer的conditional类 确定当有compactDisc bean被装配时 才进行 MediaPlayer的创建(bean)
 * */
public class CDplayerConditon implements Condition {

	@Override
	public boolean matches(ConditionContext context,
			AnnotatedTypeMetadata metadata) {
		// TODO Auto-generated method stub
		Environment env = context.getEnvironment();
		ConfigurableListableBeanFactory fac = context.getBeanFactory();
		return fac.containsBean("compactDisc");
	}

}
