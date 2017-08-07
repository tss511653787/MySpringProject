package Ch2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

@Target({ ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD,
		ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
/*
 * 使得自己定义的BeatlesMusic注解具有Qualifier特性
 */
@Qualifier
public @interface BeatlesMusic {
	// none code
}
