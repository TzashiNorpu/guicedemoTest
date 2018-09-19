package com.demo.server.impl;

import com.demo.server.OrderService;
import com.demo.server.PaymentService;
import com.demo.server.PriceService;

import javax.inject.Inject;

/**
 * @program: guicedemoTest
 * @description: OrderServiceImpl
 * @author: TzashiNorpu
 * @create: 2018-09-19
 **/
public class OrderServiceImpl implements OrderService {
    private final PriceService priceService;
    private final PaymentService paymentService;
    private final SessionManager sessionManager;

    private Long ordersPaid = 0L;
    @Inject
    public OrderServiceImpl(PriceService priceService,
                            PaymentService paymentService,
                            SessionManager sessionManager) {
        this.priceService = priceService;
        this.paymentService = paymentService;
        this.sessionManager = sessionManager;
    }

    @Override
    public void sendToPayment(long orderId){
        long price = priceService.getPrice(orderId);
        paymentService.pay(orderId,price,
                sessionManager.getSessionId());
        ordersPaid = ordersPaid + 1;

        throw new RuntimeException("Price ="+price+",SessionID= "+
                                    sessionManager.getSessionId()+
                                    ",orderPaid="+ordersPaid);
    }
}
