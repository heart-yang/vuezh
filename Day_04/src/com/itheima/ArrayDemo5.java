package com.itheima;
//数组排大小
public class ArrayDemo5 {
    public static void main(String[] args) {
//        定义一个数组
        int[] arr = {12,23,1,2,45,21};
        for (int i = 0; i <arr.length-1 ; i++) {
            for(int j=i+1;j< arr.length;j++){
//              如果第一个数小于第二个数,把两个数交换
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
//        遍历数组
        System.out.print("[");
         for (int j = 0; j < arr.length; j++) {
              if(j==arr.length-1){
                    System.out.println(arr[j]+"]");
                }else{
                    System.out.print(arr[j]+",");
                }

            }
    }
}
