package com.jeesite.common.mybatis.annotation;	
	
import java.lang.annotation.Documented;	
import java.lang.annotation.ElementType;	
import java.lang.annotation.Retention;	
import java.lang.annotation.RetentionPolicy;	
import java.lang.annotation.Target;	
import org.springframework.stereotype.Component;	
	
@Retention(RetentionPolicy.RUNTIME)	
@Target({ElementType.TYPE})	
@Documented	
@Component	
public @interface MyBatisDao {	
   Class entity() default Class.class;	
	
   String value() default "";	
	
   String dataSourceName() default "";	
}	
