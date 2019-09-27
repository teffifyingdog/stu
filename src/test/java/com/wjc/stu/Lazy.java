package com.wjc.stu;

public class Lazy {
    private Lazy(){
        System.out.println("懒汉模式");
    }

    private static Lazy lazy=null;

    public synchronized static  Lazy getLazy(){
        if (lazy==null){
            lazy=new Lazy();
        }
        return lazy;
    }
}
