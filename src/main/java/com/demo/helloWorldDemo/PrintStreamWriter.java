package com.demo.helloWorldDemo;

import javax.inject.Inject;
import java.io.PrintStream;

/**
 * @program: guicedemoTest
 * @description:
 * @author: TzashiNorpu
 * @create: 2018-09-19
 **/
public class PrintStreamWriter implements Mydestination {

    private PrintStream destination;
    @Inject
    public PrintStreamWriter(PrintStream destination) {
        this.destination = destination;
    }

    @Override
    public void write(String string){
        destination.println(string);
    }
}
