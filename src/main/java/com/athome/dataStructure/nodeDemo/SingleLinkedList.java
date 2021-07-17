package com.athome.dataStructure.nodeDemo;

/**
 * @Author:
 * @Date: 2021/7/17 17:53
 * @Description:
 */
public class SingleLinkedList {
    //初始化一个头节点，头节点不要动，不存放具体数据
    private HeroNode head = new HeroNode(0,"","");

    //添加节点到单向链表
    //思路：
    //1,找到当前链表的最后节点
    //2.将这个节点的next指向新的节点
    public void add(HeroNode heroNode){
        //借助临时节点去遍历,因为head头节点不能动，
        HeroNode tmp = head;
        //遍历链表，找到最后
        while (tmp.next != null) {
            //终止条件
            //如果没有找到最后，将tmp后移
            tmp = tmp.next;
        }
        //当退出while循环时候，tmp就指向了链表的最后
        //将这个节点的next指向新的节点
        tmp.next = heroNode;
    }

    //显示链表
    public void list(){
        //判断链表是否为空
        if(head.next == null){
            System.out.println("链表为空");
            return;
        }
        //因为头节点不能动，因此需要一个辅助变量来遍历
        HeroNode tmp = head.next;//获取下一个节点
        while (tmp != null) {
            //是否到链表最后
            //输出节点的信息
            System.out.println(tmp);
            //将tmp后移
            tmp = tmp.next;
        }
    }

    public void addByOrder(HeroNode heroNode){
        //头节点不能动，通过辅助之中查找添加的位置
        //因为是单链表，所以我们要找添加位置的前一个节点
        HeroNode temp = head;//辅助指针接收头节点
        boolean flag = false;
        //添加的编号是否存在，默认未false
        while(true){
            //判断是否已经再链表的最后
            if(temp.next ==null){
                break;
            }
            //位置找到
            if(temp.next.no > heroNode.no){
                break;
            } else if(temp.next.no == heroNode.no){
                flag = true;//说明编号存在
                break;
            }
            temp = temp.next;//后移遍历
        }
        //判断flag
        if(flag){
            System.out.printf("准备插入的英雄编号 %d已经存在,不能加入\n", heroNode.no);
        } else {
            //插入到链表中，temp的后面
            heroNode.next = temp.next;
            temp.next = heroNode;
        }
    }
}
