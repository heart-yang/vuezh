package com.itheima;

/*
 * 数组异常:
 *   1.数组索引越界异常:ArrayIndexOutOfBoundsException
 *   2.空指针异常:NullPointerException
 * */
public class ArrayException3 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr[5]);//数组越界异常
        int[] arr2 = {1, 2, 3};
        arr2 = null;
        System.out.println(arr2[0]);//空指针异常
    }
}
