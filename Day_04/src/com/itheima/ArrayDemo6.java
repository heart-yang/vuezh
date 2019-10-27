package com.itheima;

import java.util.Scanner;

public class ArrayDemo6 {
    public static void main(String[] args) {
//        定义一个数组arr
        int[] arr = {12,23,13,54,65,34};
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("\n"+"请输入你要删除的数");
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(num != arr[i]){
                System.out.print(arr[i]+"  ");
            }
        }
    }
}
