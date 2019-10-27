package com.itheima;

//遍历数组  用for循环
public class ArrayTravers4 {
    public static void main(String[] args) {
//        定义一个数组
        int[] arr = {111,222,333,444,555};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        boolean[] arr2 = {true,false,true};
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        float[] arr3 = {1.2F,2.3F};
        for (int i = 0; i <arr3.length ; i++) {
            System.out.println(arr3[i]);
        }
    }
}
