package com.guanxun.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author gx*/
public class BubbleSort {

    public static void main(String[] args){

        int[] array1 = new int[]{5,8,6,3,9,2,1,7};
        sort1(array1);
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[]{5,8,6,3,9,2,1,7};
        sort2(array2);
        System.out.println(Arrays.toString(array2));
    }

    /**
     * 普通冒泡排序（从小到大）
     * */
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

    /**
     * 冒泡排序优化算法
     * 当判断到后续没有进行元素交换，说明已经排序完成了。
     * */
    public static void sort2(int[] array){

        for (int i = 0; i < array.length - 1; i++){
            // 有序标记，每一轮初始值都是true
            boolean isSorted = true;
            for (int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    //因为有元素进行交换，所以不是有序的，标记变为false
                    isSorted = false;
                }
            }
            if (isSorted){
                break;
            }
        }
    }



}
