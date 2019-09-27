package com.wjc.stu;

public class VolatileTest {
    private VolatileTest(){
        System.out.println("vt");
    }

    private static  volatile VolatileTest vt=null;

    public  static VolatileTest getVt(){
        if (vt==null){
            synchronized (VolatileTest.class){
                if (vt==null){
                    vt=new VolatileTest();
                }
            }
        }
        return vt;
    }
}
