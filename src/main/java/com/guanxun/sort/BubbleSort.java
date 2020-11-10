package com.guanxun.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author gx*/
public class BubbleSort {

    public static void main(String[] args){

        int[] array = new int[]{5,8,6,3,9,2,1,7};
        sort1(array);
        System.out.println(Arrays.toString(array));

    }

    private static void sort1(int[] array){

        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - i - 1; j++){
                if (array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }

    }

}
