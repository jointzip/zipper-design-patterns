package com.athome.designers.strategy.v1.move;

import com.athome.designers.strategy.v1.move.Movable;

/**
 * @Author:
 * @Date: 2021/7/8 12:32
 * @Description:
 */
public class Jump implements Movable {
    @Override
    public void move() {
        System.out.println("正在跳跃前进");
    }
}
