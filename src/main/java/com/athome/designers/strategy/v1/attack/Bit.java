package com.athome.designers.strategy.v1.attack;

/**
 * @Author:
 * @Date: 2021/7/8 12:18
 * @Description:   具体的攻击方式实现了抽象的攻击接口
 */
public class Bit implements Attackable {

    @Override
    public void attack() {
        System.out.println("该角色通过咬人，造成了100点的伤害");
    }
}
