package com.itheima;

import java.util.Scanner;

/*
 * 练习减肥计划，
 * */
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jfjh(sc);
    }

    //减肥计划方法
    public static void Jfjh(Scanner sc) {
        while (true) {
            System.out.println("请输入星期数");
            int day = sc.nextInt();
            switch (day) {
                case 1:
                    System.out.println("跑步");
                    return;
                case 2:
                    System.out.println("游泳");
                    return;
                case 3:
                    System.out.println("慢走");
                    return;
                case 4:
                    System.out.println("动感单车");
                    return;
                case 5:
                    System.out.println("拳击");
                    return;
                case 6:
                    System.out.println("爬山");
                    return;
                case 7:
                    System.out.println("好好吃一顿");
                    return;
                default:
                    System.out.println("输入的星期数有误,请重新输入");

            }

        }

    }
}
