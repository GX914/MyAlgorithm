package com.guanxun.sort;

import java.util.Arrays;

/**
 *  插入排序
 *
 *  从第一个元素开始，每一轮遍历，用尚未排序的第一个元素，从右往左依次比较，
 *  如果左边的比要插入元素大，那么就把右边的元素，赋值为左边的数值，依次逐步类推，
 *  直到左边的比要插入的元素小，那么就把当前右边元素赋值为要插入的元素
 *
 * */
public class InsertSort {

    public static void main(String[] args){

        int[] array = new int[]{5,4,8,6,3,9,2,1,7};
        sort2(array);
        System.out.println(Arrays.toString(array));

    }

    private static void sort(int[] array){

        for (int i = 1; i < array.length; i++){
            System.out.println(Arrays.toString(array));
            for (int j = i-1; j >= 0; j--){
                if (array[j+1] < array[j]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                } else {
                    break;
                }
            }
        }
    }

    private static void sort2(int[] array){

        for (int i = 1; i < array.length; i++){
            // 记录要插入的数字
            int tmp = array[i];

            // 从已经排好序最右边下一个元素开始
            int j = i;
            while (j > 0 && tmp < array[j-1]){
                array[j] = array[j - 1];
                j--;
            }

            if(j != i){
                array[j] = tmp;
            }

        }

    }

}
