package com.demo.server;

/**
 * @program: guicedemoTest
 * @description: OrderService
 * @author: TzashiNorpu
 * @create: 2018-09-19
 **/
public interface OrderService {
    void sendToPayment(long orderId);
}
