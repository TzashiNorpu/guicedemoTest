package com.demo;

import com.demo.helloWorldDemo.Configuration;
import com.demo.helloWorldDemo.MainModule;
import com.demo.helloWorldDemo.MyApplet;
import com.google.inject.Guice;


/**
 * Hello world!
 * bootstrap:
 * parse command line
 * setup environment
 * kick off main logic
 */
public class App  {
    public static void main(String[] args) {
//        MyApplet mainApplet = Configuration.getMainApplet();
        MyApplet mainApplet = Guice.createInjector(new MainModule())
                .getInstance(MyApplet.class);
        mainApplet.run();
    }
}
