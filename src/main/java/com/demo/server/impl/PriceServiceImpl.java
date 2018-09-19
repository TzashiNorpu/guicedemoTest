package com.demo.server.impl;

import com.demo.server.PriceService;

/**
 * @program: guicedemoTest
 * @description: PriceServiceImpl
 * @author: TzashiNorpu
 * @create: 2018-09-19
 **/
public class PriceServiceImpl implements PriceService {
    @Override
    public long getPrice(long orderId) {
        return 456L;
    }
}
