package com.athome.designers.yangzhou.v3.synchronizedDemo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author:
 * @Date: 2021/7/10 8:33
 * @Description:    LockSupport 是线程等待唤醒机制（wait/notify）的加强改良版
 *
 *
 *  方法1  synchronized  对应wait和notify,1.无法脱离synchronized关键字，在代码块内部执行，2.而且顺序不可以调换，否则程序一直等待
 *  方法2  lock     对应await和signal
 *  方法3  LockSupport  park和unpark  使用Permit许可来实现，只有1和0两个值，默认为0，，park和unpark底层是unsafe
 *      优点：unpark可以在park前使用,unpark相当于颁发许可证+1，park消耗许可证，最多只有一个许可证，调用多个park时候，调用方会阻塞后续程序
 *
 *      ********面试题：为什么唤醒两次后阻塞两次最终结果还是会阻塞线程？
 *      因为凭证permit最多为1，前两次连续unpark和一次调用结果相同，permit值最大只能为1，故park两次的许可证不够，不会放行
 */
public class LockSupportTest {
    static Object objLock = new Object();

    public static void main(String[] args) {
        Thread a = new Thread(() -> {
//            try {
////                Thread.sleep(3000);//单位是ms
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
            try {
                TimeUnit.SECONDS.sleep(3);//单位是s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "\t" + "进入");
            LockSupport.park();//如果先唤醒，此行等同于不存在
            System.out.println(Thread.currentThread().getName() + "\t" + "被唤醒");
        }, "线程a");
        a.start();//启动a线程

        Thread b = new Thread(() -> {
            LockSupport.unpark(a);
            System.out.println(Thread.currentThread().getName() + "\t" + "去通知");
        }, "线程b");
        b.start();//启动b线程
    }

    /**
     * @Author ZhaoPo
     * @Description
     * @Date  2021/7/10
     * @Param   二：缺陷同内置锁
     * @return void
     **/
    private static void lockAwaitAndSignal() {
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        new Thread(() -> {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "\t" + "携带lock锁进入");
            try {
                condition.await();
                System.out.println(Thread.currentThread().getName() + "\t" + "被唤醒");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.unlock();
        },"线程A").start();

        new Thread(() -> {
            lock.lock();
            condition.signal();
            System.out.println(Thread.currentThread().getName() + "\t" + "去通知");
            lock.unlock();

        }, "线程B").start();
    }

    /**
     * @Author ZhaoPo
     * @Description   一：object中的wait和notify方法
     * @Date  2021/7/10
     * @Param
     * @return void
     **/
    private static void ObjectWaitAndNotify() {
        new Thread(()->{
            synchronized (objLock){
                System.out.println(Thread.currentThread().getName() + "\t" + "com in");
                try {
                    objLock.wait();//此处阻塞
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "\t" + "被唤醒");//b语句
            }

        },"丈夫").start();

        new Thread(()->{
           synchronized (objLock){
               objLock.notify();//此处唤醒会首先执行a语句，再去唤醒b语句
               System.out.println(Thread.currentThread().getName() + "\t" + "通知");//a语句
           }
        },"老婆").start();
    }
}
