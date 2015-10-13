package kz.kazntu.lessons.spring.hello.impl;

import kz.kazntu.lessons.spring.hello.HelloWorld;

/**
 * Created by daulet on 10/14/15.
 */
public class HelloWorldImpl implements HelloWorld {
    @Override
    public void sayHelloWorld(String st) {
        System.out.println(st);
    }
}
