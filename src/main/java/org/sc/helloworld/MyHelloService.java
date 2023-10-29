package org.sc.helloworld;

public class MyHelloService implements HelloService {

    @Override
    public void printHello(String name) {
        System.out.println("Hello " + name);
    }

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

}