package com.wjc.stu;

public class   enumTest {
    private enumTest(){
        System.out.println("单例模式");
    }
    private static class GetEnumTest{
        private static final enumTest ET=new enumTest();
    }

    public static final enumTest getInstance(){
        return GetEnumTest.ET;
    }

}
