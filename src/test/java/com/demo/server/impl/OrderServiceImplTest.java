package com.demo.server.impl;

import com.demo.server.OrderService;
import com.google.inject.Guice;
import org.junit.Test;


public class OrderServiceImplTest {

    @Test
    public void sendToPayment() {
        OrderService orderService = Guice.createInjector(new ServerModule()).getInstance(OrderService.class);
        orderService.sendToPayment(789L);
    }
}