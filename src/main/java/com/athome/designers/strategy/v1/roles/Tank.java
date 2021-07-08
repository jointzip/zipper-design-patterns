package com.athome.designers.strategy.v1.roles;

import com.athome.designers.strategy.v1.attack.Attackable;
import com.athome.designers.strategy.v1.move.Movable;

/**
 * @Author:
 * @Date: 2021/7/8 12:40
 * @Description:
 */
public class Tank extends GameRole {
    public Tank(Movable movable, Attackable attackable) {
        super(movable, attackable);
    }

    @Override
    public void display() {
        System.out.println("我是一名坦克");
    }

    @Override
    void attack() {
        attackable.attack();
    }

    @Override
    void move() {
        movable.move();
    }
}
