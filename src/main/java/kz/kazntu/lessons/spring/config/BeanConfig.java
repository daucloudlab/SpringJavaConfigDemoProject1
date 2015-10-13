package kz.kazntu.lessons.spring.config;

import kz.kazntu.lessons.spring.hello.HelloWorld;
import kz.kazntu.lessons.spring.hello.impl.HelloWorldImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by daulet on 10/14/15.
 */
@Configuration
public class BeanConfig {
    @Bean(name = "helloBean")
    public HelloWorld helloWorld(){
        return new HelloWorldImpl() ;
    }
}
