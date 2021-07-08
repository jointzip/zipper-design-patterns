package com.athome.designers.strategy.v1.roles;

import com.athome.designers.strategy.v1.attack.Attackable;
import com.athome.designers.strategy.v1.move.Movable;

/**
 * @Author:
 * @Date: 2021/7/8 11:51
 * @Description:  游戏角色--为什么一定要是抽象类？  通用的角色一般用抽象类
 * 抽象类和普通类，接口的区别
 * 1.抽象类不能被实例化，可以有构造器，其他和普通类没有区分，可以有默认方法实现，接口不行
 * 2.用来捕捉子类的通用特性，被用来创建子类的模板
 * 3.子类不是抽象类的话，需要提供所有的声明方法的实现
 *
 */
public abstract class GameRole {

    public abstract void display();
    Movable movable;
    Attackable attackable;

    ///为什么要引入抽象方法move和attack,因为他们是所有角色的通用行为,所以此处不能去实现

    abstract void attack();
    abstract void move();

    //构造器
    public GameRole(Movable movable, Attackable attackable) {
        this.movable = movable;
        this.attackable = attackable;
    }

    public Movable getMovable() {
        return movable;
    }

    //set方法隔离全局变量,让外界不能够直接修改全局变量
    public void setMovable(Movable movable) {
        this.movable = movable;
    }

    public Attackable getAttackable() {
        return attackable;
    }

    public void setAttackable(Attackable attackable) {
        this.attackable = attackable;
    }
}
