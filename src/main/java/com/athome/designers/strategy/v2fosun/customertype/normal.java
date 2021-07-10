package com.athome.designers.strategy.v2fosun.customertype;

import com.athome.designers.strategy.v2fosun.makeOrder.Order;
import com.athome.designers.strategy.v2fosun.makeOrder.OrderWayA;
import com.athome.designers.strategy.v2fosun.makeOrder.OrderWayB;
import com.athome.designers.strategy.v2fosun.makeSettle.Settle;
import com.athome.designers.strategy.v2fosun.makeSettle.SettleA;
import com.athome.designers.strategy.v2fosun.makeSettle.SettleB;

/**
 * @Author:
 * @Date: 2021/7/9 22:21
 * @Description:
 */
public class normal extends Customer{
    public normal() {
        super(new OrderWayB(), new SettleB());
    }

    public normal(Order order, Settle settle) {
        super(order, settle);
    }

    void settlement() {
       settle.settle();
    }

    void orderBed() {
        order.makeOrder();
    }
}
