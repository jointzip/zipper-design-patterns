package com.athome.designers.strategy.v1.startMain;

import com.athome.designers.strategy.v1.roles.MagicRole;
import com.athome.designers.strategy.v1.roles.Shooter;

import java.lang.reflect.Method;

/**
 * @Author:
 * @Date: 2021/7/8 12:42
 * @Description:
 */
public class GameStart {
    public static void main(String[] args) {
        //一名法师角色
        MagicRole magicRole = new MagicRole();
        magicRole.display();
        magicRole.attack();
        magicRole.move();

//        Class<Shooter> shooterClass = Shooter.class;
//        Method[] declaredMethods = shooterClass.getDeclaredMethods();
//        for (Method declaredMethod : declaredMethods) {
//            System.out.println(declaredMethod.getName());
//        }
    }
}
