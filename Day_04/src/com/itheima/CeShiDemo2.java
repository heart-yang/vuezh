package com.itheima;

import java.util.Random;

/*二、分析并完成以下需求,并且用代码实现:
	随机生成10个1-50之间的随机数(包括1和50),将生成的数放到合适的数组中
	获取该数组元素的最大值max,最小值min,和平均值avg
	将结果打印在控制台上*/
public class CeShiDemo2 {
    public static void main(String[] args) {
        //定义一个长度为10的数组
        int[] arr = new int[10];
        int sum = 0;
//        生成10个随机数存储到数组中,次数确定使用for循环
        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            arr[i] = r.nextInt(50) + 1;
        }
//        求最大值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +"  ");//遍历打印数组
            sum += arr[i];  //记录数组中数据的和
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("\n最大值为"+ max);
//        最小值
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("最小值为" + min);
        System.out.println("平均值为" + sum*1.0/arr.length);
    }
}
