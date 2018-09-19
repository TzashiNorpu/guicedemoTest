package com.demo.helloWorldDemo;

import com.google.inject.AbstractModule;

/**
 * @program: guicedemoTest
 * @description: 注入
 * @author: TzashiNorpu
 * @create: 2018-09-19
 **/
public class MainModule extends AbstractModule{
    @Override
    protected void configure(){
        install(new HelloWorldModule());
    }
}
