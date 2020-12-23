package com.guanxun.sort;

import java.util.Arrays;

/**
 *  选择排序（时间复杂度为n的平方，最好最坏都是n的平方，空间复杂度为1）
 *
 *  遍历数组，每遍历一轮，比较出其中最小的元素，插入到本轮所有比较元素的最前面。
 *  每一轮比较，起始点在插入元素后面一个元素开始。
 *
 * */
public class SelectSort {

    public static void main(String[] args){

        int[] array = new int[]{5,8,6,3,9,2,1,7};
        sort(array);
        System.out.println(Arrays.toString(array));

    }


    // 从小到大
    private static void sort(int[] array){

        if (array.length == 0)
            System.out.println("入参不能为空！");

        for (int i = 0; i < array.length - 1; i++){
            int min = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[min]){
                    min = j;
                }
            }

            if (i != min){
                int tmp = array[i];
                array[i] = array[min];
                array[min] = tmp;
            }
        }
    }

}
