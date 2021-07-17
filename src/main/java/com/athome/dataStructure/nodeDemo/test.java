package com.athome.dataStructure.nodeDemo;

/**
 * @Author:
 * @Date: 2021/7/17 18:32
 * @Description:
 */
public class test {
    public static void main(String[] args) {
        //测试
        HeroNode hero1 = new HeroNode(1, "韩信", "小韩");
        HeroNode hero2 = new HeroNode(2, "李白", "小李");
        HeroNode hero3 = new HeroNode(3, "孙策", "小孙");

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        //加入,此时add没有考虑编号
//        singleLinkedList.add(hero1);
//        singleLinkedList.add(hero2);
//        singleLinkedList.add(hero3);

        //按照编号
        singleLinkedList.addByOrder(hero1);
        singleLinkedList.addByOrder(hero3);
        singleLinkedList.addByOrder(hero2);
        singleLinkedList.addByOrder(hero2);
        //遍历
        singleLinkedList.list();
    }
}
