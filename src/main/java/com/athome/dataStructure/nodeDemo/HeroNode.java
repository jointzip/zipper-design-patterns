package com.athome.dataStructure.nodeDemo;

/**
 * @Author:
 * @Date: 2021/7/17 17:48
 * @Description:
 */
public class HeroNode {
    public int no;
    private String name;
    private String nickName;
    public HeroNode next;


    public HeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName +
                '}';
    }
}
