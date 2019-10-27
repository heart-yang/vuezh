package com.itheima;
/*能够完成数组的获取最值操作*/
public class Anli8 {
    public static void main(String[] args) {
        int[] arr = {43,54,324,56,1,77,-2};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("最大数为" + max);
        System.out.println("最小数为"+min);
    }
}
