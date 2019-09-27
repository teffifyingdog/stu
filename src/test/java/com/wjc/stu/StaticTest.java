package com.wjc.stu;

public class StaticTest {


    StaticTest(){
        System.out.println("构造方法");
        System.out.println("a = " + a+"，b="+b);
    }


    public static void main(String[] args){
//        staticTest.test();
//        StaticTest staticTest1 = new StaticTest();
//        staticTest1.test();
//        staticTest.test();
//        Lazy lazy = Lazy.getLazy();
//        Lazy lazy1 = Lazy.getLazy();
//        boolean flag=true;
//        while (!flag){
//            System.out.println("t");
//        }
        VolatileTest vt = VolatileTest.getVt();
        VolatileTest vt2 = VolatileTest.getVt();

    }

    static StaticTest staticTest =new StaticTest();


    static {
        System.out.println("静态块");
    }

    public static void  test(){
        System.out.println("test方法");
    }
    {
        System.out.println("构造代码块");
    }

    int a=1;
    static int b=1;
}
