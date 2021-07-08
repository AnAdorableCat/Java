package day16;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//测试 自定义注解
public class Test4_Anno {

}
//第一步:定义注解  -- 语法:@interface 注解名
//1,注解出现的位置
@Target({ElementType.TYPE , ElementType.PARAMETER ,ElementType.FIELD})
//2,注解的生命周期
@Retention(RetentionPolicy.SOURCE)
@interface Mapper{
    //3,给注解添加功能
    String name() default "jack";//4,给属性赋予默认值
    //5,注解的特殊属性--特殊值在用时可以直接赋值
    String value() default "jack";
}
//第二步:使用注解
//1, @注解名
//2,注解的位置必须符合 @Target 的要求
@Mapper(name="Hello")//4,指定name属性值
class Hello{
    //5,使用name属性的默认值,value的值是"name"
    @Mapper("name")
    String name;
//    @Mapper 3,是不合法的位置
    public void show(@Mapper int age){
        System.out.println(age);
    }
}
