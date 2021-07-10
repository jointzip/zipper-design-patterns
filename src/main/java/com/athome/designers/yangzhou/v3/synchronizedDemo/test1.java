package com.athome.designers.yangzhou.v3.synchronizedDemo;

/**
 * @Author:
 * @Date: 2021/7/9 20:21
 * @Description:   同步代码块
 */
public class test1 {

    private static Object synchronizedObj = new Object();
    private static Object obj2 = new Object();

    public static void method1(){
        synchronized (obj2){
            System.out.println("外部");
            synchronized (synchronizedObj){
                System.out.println("中间");
                synchronized (obj2){
                    System.out.println("内部");
                }
            }
        }
    }
    public static void main(String[] args) {
        method1();
    }
}
