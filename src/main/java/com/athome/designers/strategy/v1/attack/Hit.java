package com.athome.designers.strategy.v1.attack;

import com.athome.designers.strategy.v1.attack.Attackable;

/**
 * @Author:
 * @Date: 2021/7/8 12:22
 * @Description:
 */
public class Hit implements Attackable {
    @Override
    public void attack() {
        System.out.println("该角色通过击打，造成敌人800点伤害");
    }
}
