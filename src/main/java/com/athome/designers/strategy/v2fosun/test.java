package com.athome.designers.strategy.v2fosun;

import com.athome.designers.strategy.v2fosun.customertype.Membership;
import com.athome.designers.strategy.v2fosun.makeOrder.OrderWayA;
import sun.applet.Main;

import java.util.jar.Manifest;

/**
 * @Author:
 * @Date: 2021/7/9 22:46
 * @Description:
 */
public class test {
    public static void main(String[] args) {
        Membership membership = new Membership();
        membership.orderBed();
        membership.settlement();
    }
}
