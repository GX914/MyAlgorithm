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

        int[] array3 = new int[]{5,8,6,3,9,2,1,7};
        sort3(array3);
        System.out.println(Arrays.toString(array3));

        int[] array4 = new int[]{5,8,6,3,9,2,1,7};
        sort4(array4);
        System.out.println(Arrays.toString(array4));
    }

    /**
     * 第一版
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
     * 第二版
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

    /**
     * 第三版
     * 冒泡排序优化算法
     * 1.建立标记lastExchangeIndex，表示在这个下标后面没有已经排序完成，不用往后比较排序
     * 2.建立标记isSorted，表示在上一轮中没有发生元素互换，排序完成。
     * */
    public static void sort3(int[] array){

        int lastExchangeIndex = 0;
        int sortBorder = array.length - 1;
        for (int i = 0; i < array.length - 1; i++){
            boolean isSorted = true;
            for (int j = 0;j < sortBorder; j++){
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    isSorted = false;
                    lastExchangeIndex = j;
                }
            }
            sortBorder = lastExchangeIndex;
            if (isSorted){
                break;
            }
        }
    }

    /**
     * 鸡尾酒排序算法
     * */
    public static void sort4(int[] array){

        int tmp = 0;
        for (int i = 0; i < array.length/2; i++){
            // 有序标记，每一轮的初始值都是true
            boolean isSorted = true;
            // 奇数轮，从左向右比较和交换
            for (int j = 1; j < array.length - i - 1; j++){
                if (array[j] > array[j+1]){
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    isSorted = false;
                }
            }
            if (isSorted){
                break;
            }
            // 在偶数轮之前，将isSorted重新标记为true
            isSorted = true;
            // 偶数轮,从右向左比较和交换
            for (int j = array.length - i - 1; j > i; j--){
                if(array[j] < array[j-1]){
                    tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                    // 因为有元素进行交换，所以不是有序的，标记变为false
                    isSorted = false;
                }
            }
            if (isSorted){
                break;
            }
        }
    }



}
