package com.wjc.stu;
/*
饿汉模式实现单例模式
 */
public class Hungry {

    private Hungry(){
        System.out.println("饿汉模式");
    }

    private static Hungry hungry=new Hungry();

    public static Hungry getHungry(){
        return hungry;
    }
}
