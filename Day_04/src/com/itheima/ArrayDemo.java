package com.itheima;
/*
* 静态数组定义的时候不能分步,动态数组可以先定义后使用
* */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr =new int[3];
        int[] arr2 = new int[3];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        arr[0]=200;
        arr[2]=12;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
