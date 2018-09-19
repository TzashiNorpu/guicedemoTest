package com.demo.helloWorldDemo;

/**
 * @program: guicedemoTest
 * @description: HelloWorldPrinter
 * @author: TzashiNorpu
 * @create: 2018-09-19
 **/
public class HelloWorldPrinter implements MyApplet {
    private void printHelloWorld() {
        System.out.println("Hello World!!!");
    }

    public void run() {
        printHelloWorld();
    }
}
