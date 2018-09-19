package com.demo.helloWorldDemo;

/**
 * @program: guicedemoTest
 * @description: StringWritingApplet
 * @author: TzashiNorpu
 * @create: 2018-09-19
 **/
public class StringWritingApplet implements MyApplet {

    private Mydestination destination;
    private StringProvider stringProvider;

    public StringWritingApplet(Mydestination destination, StringProvider stringProvider) {
        this.destination = destination;
        this.stringProvider = stringProvider;
    }

    private void writeString() {
        destination.write(stringProvider.get());
    }

    public void run() {
        writeString();
    }
}
