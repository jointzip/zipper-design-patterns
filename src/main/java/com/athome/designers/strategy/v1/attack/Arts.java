package com.athome.designers.strategy.v1.attack;

/**
 * @Author:
 * @Date: 2021/7/8 12:48
 * @Description:
 */
public class Arts implements Attackable {
    @Override
    public void attack() {
        System.out.println("通过法术对敌人造成了1000点伤害");
    }
}
