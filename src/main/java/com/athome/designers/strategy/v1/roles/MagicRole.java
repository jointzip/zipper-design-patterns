package com.athome.designers.strategy.v1.roles;

import com.athome.designers.strategy.v1.attack.Arts;
import com.athome.designers.strategy.v1.attack.Attackable;
import com.athome.designers.strategy.v1.move.Jump;
import com.athome.designers.strategy.v1.move.Movable;

/**
 * @Author:
 * @Date: 2021/7/8 12:24
 * @Description:    法师角色
 */
public class MagicRole extends GameRole {

    public MagicRole() {
        super(new Jump(), new Arts());
    }

    public MagicRole(Movable movable, Attackable attackable) {
        super(movable, attackable);
    }

    @Override
    public void display() {
        System.out.println("我是一名法师");
    }

    @Override
    public void attack() {
        attackable.attack();
    }

    @Override
    public void move() {
        movable.move();
    }
}
