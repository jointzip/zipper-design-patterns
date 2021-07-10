package com.athome.designers.strategy.v2fosun.customertype;

import com.athome.designers.strategy.v2fosun.makeOrder.Order;
import com.athome.designers.strategy.v2fosun.makeSettle.Settle;

/**
 * @Author:
 * @Date: 2021/7/9 22:09
 * @Description:  客户的抽象类
 */
public abstract class Customer {
    Order order;
    Settle settle;

    //客户结算的
    abstract void settlement();

    //订床
    abstract void orderBed();

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Settle getSettle() {
        return settle;
    }

    public void setSettle(Settle settle) {
        this.settle = settle;
    }

    public Customer() {
    }

    public Customer(Order order, Settle settle) {
        this.order = order;
        this.settle = settle;
    }



}
