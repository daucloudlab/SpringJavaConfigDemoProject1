package kz.kazntu.lessons.spring;

import kz.kazntu.lessons.spring.config.BeanConfig;
import kz.kazntu.lessons.spring.hello.HelloWorld;
import kz.kazntu.lessons.spring.hello.impl.HelloWorldImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class) ;

        HelloWorld obj = (HelloWorldImpl)context.getBean("helloBean") ;
        obj.sayHelloWorld("Hello Spring Framework Annotation Configuration Demo!");
    }
}
