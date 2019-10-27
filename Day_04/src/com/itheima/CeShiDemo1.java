package com.itheima;
import java.util.Random;
import java.util.Scanner;

/*一、分析并完成以下需求,并且用代码实现:
	定义一个长度为6的int型数组arr
	数组元素为8-88,包含8-88,之间的随机数
	遍历数组arr,打印所有元素
	提示用户输入3-6之间的一个数字num,num范围包含3和6
	筛选出数组arr中是num倍数的元素,并输出*/
public class CeShiDemo1 {
    public static void main(String[] args) {
//        定义一个长度为6的int型数组arr
        int[] arr = new int[6];
        //遍历数组,并将得到的随机数存入数组中
        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            arr[i] = r.nextInt(88-8+1)+8;//8-88
        }
//        遍历数组,并打印
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
//        键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("\n"+"请输入一个3-6之间的数字");
        int num = sc.nextInt();
//        筛选出数组arr中是num倍数的元素,并输出
        for (int i = 0; i < arr.length; i++) {
            if (num<3  || num>6) {
                System.out.println("输入有误");
                break;
            }else if (arr[i] % num ==0) {
                System.out.print(arr[i] + "  ");
            }
        }

    }
}
