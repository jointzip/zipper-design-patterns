package com.athome.se;

import java.util.HashMap;

/**
 * @Author:
 * @Date: 2021/7/16 17:50
 * @Description:
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //此时会做些什么？
        //初始容量？
        //懒加载？
        HashMap map = new HashMap();
        map.put(null, "null");
        map.put("1", "李白");
        map.put("2", "韩信");
        map.put("3", "孙策");

        System.out.println(map.get("obj1"));
        ;
        map.get(null);
    }
}
