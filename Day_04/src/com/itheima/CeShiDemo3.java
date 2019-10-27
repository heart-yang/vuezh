package com.itheima;

import java.util.Random;

/*三、分析并完成以下需求,并且用代码实现:
	获取一个10-123之间(包含10和123)的随机数num,统计10-num之间(包含10和num)奇数的个数
	并将符合条件的数字和个数,打印到控制台上*/
public class CeShiDemo3 {
    public static void main(String[] args) {
        int count = 0;
        //或取一个10-123之间随机数
        Random r = new Random();
        int num = r.nextInt(123 - 10 + 1) + 10;
        for (int i = 10; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("奇数的个数为"+count);
    }
}
