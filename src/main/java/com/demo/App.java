package com.demo;

import com.demo.helloWorldDemo.Configuration;
import com.demo.helloWorldDemo.MyApplet;


/**
 * Hello world!
 * bootstrap:
 * parse command line
 * setup environment
 * kick off main logic
 */
public class App  {
    public static void main(String[] args) {
        MyApplet mainApplet = Configuration.getMainApplet();
        mainApplet.run();
    }
}
