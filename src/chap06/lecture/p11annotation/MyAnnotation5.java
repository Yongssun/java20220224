package chap06.lecture.p11annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import static java.lang.annotation.ElementType.METHOD;

@Retention(RUNTIME)
@Target(METHOD)
public @interface MyAnnotation5 {
	String name();//element(attribute)
}
