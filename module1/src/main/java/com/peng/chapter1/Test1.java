package com.peng.chapter1;

public class Test1 {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("吴兆鹏");
        student.setAge(20);
        student.setChinese(80.5F);
        student.setAmount(766777.2243);

        Student student2 = new Student();
        student2.setName("吴兆鹏1");
        student2.setAge(25);
        student2.setChinese(83.5F);
        student2.setAmount(7777.3);

        System.out.println("student name is " + student.getName());

        if (student2.getAge() < 20) {
            System.out.println(student2.getName() + "的年齡小于20");
        } else {
            System.out.println(student2.getName() + "的年龄大于等于20");
        }

        /*
        for (int i = 0; i < 100; i++) {
            System.out.println("当前值是 " + i);
            if (i == 50) {
                break;
            }
        }
        */

        /*
        int i = 0;
        while (i < 100) {
            System.out.println("当前值是 " + i);
            if (i == 50) {
                break;
            }
            i++;
        }
        */

        int i = 0;
        do {
            System.out.println("当前值是 " + i);
            i++;
        } while (i < 100);


    }

}
