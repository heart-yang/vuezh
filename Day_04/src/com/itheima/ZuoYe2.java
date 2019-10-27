package com.itheima;

import java.util.Random;

/*第二题:
	  (1)定义一个长度为10的int类型数组，元素值使用随机数生成（范围为50-80）
	  (2)打印该数组中满足个位和十位不包含7的元素。*/
public class ZuoYe2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
//        遍历数组,将所有的随机数存储在arr数组中
        for (int i = 0; i < arr.length; i++) {
//            获取一个随机数
            Random r = new Random();
            arr[i] = r.nextInt(80-50+1)+50;//范围为50-80,(最大数-最小数+1)+最小数
        }
//        遍历数组,输出满足条件的数
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 7 || arr[i] / 10 % 10 == 7) {
                continue;
            }
                System.out.print(arr[i] + "   ");

        }
    }
}
