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
    }

}
