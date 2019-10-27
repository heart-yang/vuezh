package com.itheima;

import java.util.Random;

/*第三题：分析以下需求并实现
	1.定义一个用于存放班级分数的数组 int[] score,数组长度为5
		并使用随机数（范围为0-100）为数组赋值
	2.求出班级不及格人数(分数低于60分的就是不及格)
	3.求出班级的平均分
	4.求出班级的总分数*/
public class ZuoYe3 {
    public static void main(String[] args) {
//        定义一个int类型的数组,用于存放班级分数
        int[] arr = new int[5];
        int sum=0;//记录总分
//        定义count用于记录成绩不及格人数
        int count = 0;
//        将随机数存到数组中
        for (int i = 0; i <arr.length ; i++) {
            Random r = new Random();
            arr[i] = r.nextInt(101);//0-100
        }
//        遍历数组
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");//输出数组的每一个数
            sum += arr[i];
            if (arr[i]<60){
                count++;
            }
        }
        System.out.println("\n"+"班级不及格的人数有" + count + "个");
        System.out.println("班级总分为:"+ sum);
        System.out.println("班级平均分为:"+sum*1.0/(arr.length));
    }
}
