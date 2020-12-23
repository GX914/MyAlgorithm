package com.guanxun.sort;

import java.util.Arrays;

/**
 * 希尔排序
 *
 * 详细：https://segmentfault.com/a/1190000013967025
 * */
public class ShellSort {

    public static void main(String[] args){

        int[] array = new int[]{5,4,8,6,3,9,2,1,7};
        sort(array);
        System.out.println(Arrays.toString(array));

    }

    private static void sort(int[] arrays){

        // 希尔增量每次/2
        for (int step = arrays.length/2;step > 0;step /= 2){

            // 从增量那组开始进行插入排序，直至完毕
            for (int i = step; i < arrays.length; i++){
                int j = i;
                int temp = arrays[j];

                // j - step 就是代表与他同组隔壁的元素
                while (j - step >= 0 && arrays[j - step] > temp){
                    arrays[j] = arrays[j - step];
                    j = j - step;
                }
                arrays[j] = temp;
            }

        }

    }




}
