package com.athome.designers.strategy.v1.roles;

import com.athome.designers.strategy.v1.attack.Attackable;
import com.athome.designers.strategy.v1.move.Movable;

/**
 * @Author:
 * @Date: 2021/7/8 12:36
 * @Description:
 */
public class Shooter extends GameRole{
    public Shooter(Movable movable, Attackable attackable) {
        super(movable, attackable);
    }

    @Override
    public void display() {
        System.out.println("我是射手");
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
