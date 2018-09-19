package com.demo.server.impl;

import com.demo.server.OrderService;
import com.demo.server.PaymentService;
import com.demo.server.PriceService;
import com.google.inject.AbstractModule;

import javax.swing.*;

/**
 * @program: guicedemoTest
 * @description: ServerModule
 * @author: TzashiNorpu
 * @create: 2018-09-19
 **/
public class ServerModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(OrderService.class).to(OrderServiceImpl.class);
        bind(PaymentService.class).to(PaymentServiceImpl.class);
        bind(PriceService.class).to(PriceServiceImpl.class);
    }
}
