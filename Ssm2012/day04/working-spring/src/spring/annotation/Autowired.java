package spring.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//标识在谁身上：方法上，属性上
@Target( { ElementType.METHOD, 
	ElementType.FIELD } )
@Retention(RetentionPolicy.RUNTIME)
public @interface Autowired {

}
