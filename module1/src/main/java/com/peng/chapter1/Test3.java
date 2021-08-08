package com.peng.chapter1;

public class Test3 {

    public static void main(String[] args) {
        int age1 = 60;
        int age2 = 30;

        int total = age1 + age2;
        System.out.println("总共=" + total);

        int value1 = 10;
        int value2 = 3;
        System.out.println(value1 / value2);

        double d3 = 10;
        System.out.println(d3 / value2);

        System.out.println("余数=" + value1 % value2);

        for  (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println("当前值是 " + i);
            }
        }

        System.out.println("===================");

        for (int i = 0; i < 100; ) {
            System.out.println("当前值是 " + i);
            i = i + 2;
        }

    }

}
