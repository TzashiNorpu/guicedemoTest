package com.demo.helloWorldDemo;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import java.io.PrintStream;

/**
 * @program: guicedemoTest
 * @description: HelloWorldModule
 * @author: TzashiNorpu
 * @create: 2018-09-19
 **/
public class HelloWorldModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(MyApplet.class).to(StringWritingApplet.class);
        bind(Mydestination.class).to(PrintStreamWriter.class);
        bind(PrintStream.class).toInstance(System.out);
    }

    @Provides
    private String getString(){
        return  "Hello World";
    }
}
