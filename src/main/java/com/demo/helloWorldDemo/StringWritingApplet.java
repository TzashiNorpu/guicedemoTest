package com.demo.helloWorldDemo;

import javax.inject.Inject;
import com.google.inject.Provider;

/**
 * @program: guicedemoTest
 * @description: StringWritingApplet
 * @author: TzashiNorpu
 * @create: 2018-09-19
 **/
public class StringWritingApplet implements MyApplet {

    private Mydestination destination;
    private Provider<String> stringProvider;
    @Inject
    public StringWritingApplet(Mydestination destination, Provider<String> stringProvider) {
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
