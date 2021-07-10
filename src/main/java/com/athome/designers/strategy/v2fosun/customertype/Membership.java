package com.athome.designers.strategy.v2fosun.customertype;

import com.athome.designers.strategy.v2fosun.makeOrder.Order;
import com.athome.designers.strategy.v2fosun.makeOrder.OrderWayA;
import com.athome.designers.strategy.v2fosun.makeSettle.Settle;
import com.athome.designers.strategy.v2fosun.makeSettle.SettleA;

/**
 * @Author:
 * @Date: 2021/7/9 22:21
 * @Description:
 */
public class Membership extends Customer{
    public Membership() {
        super(new OrderWayA(), new SettleA());
    }

    public Membership(Order order, Settle settle) {
        super(order, settle);
    }

    public void settlement() {
        settle.settle();
    }

    public void orderBed() {
        order.makeOrder();
    }
}
