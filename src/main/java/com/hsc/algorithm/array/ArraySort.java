package com.hsc.algorithm.array;

import java.util.Arrays;

/**
 * java的十种排序
 * 稳定算法：能保证相等键的原始顺序 稳定排序算法的一些常见示例是合并排序，插入排序和冒泡排序
 * 非稳定算法：不能保证相等键的原始顺序
 *
 * INPUT：（4,5）（3,2）（4,3）（5,4）（6,4）
 * OUTPUT1：（3,2），（4,5），（4,3），（5,4），（6,4）  稳定排序
 * OUTPUT2：（3,2 ），（4,3），（4,5），（5,4），（6,4） 非稳定排序
 */
public class ArraySort {
    /**
     * 1.冒泡排序-基础版【稳定算法】
     */
    public static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /**
     * 1.1 冒泡排序-优化版【稳定算法】
     * 如果没有交换则说明剩下的元素已经是从小到大的了即跳出循环
     */
    public static void bubbleSort_1(int arr[]){
        boolean flag = true;
        for (int i = 0; i < arr.length-1; i++) {
            flag = true;
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag = false;
                }
            }
            if(flag)break;
        }
    }

    /**
     * 2.选择排序【不稳定算法】
     * 定义一个记录最小的元素下标，然后循环一次后面的元素，找到最小的元素将其放到前面排好序的序列
     */
    public static void selectSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[index]) index=j;
            }
            int min = arr[index];
            arr[index] = arr[i];
            arr[i] = min;
        }
    }

    /**
     * 3.插入排序【稳定算法】
     * 每一步都将一个待排数字插入到已经排序序列的适当位置，直到全部插入为止
     */
    public static void insertSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int j=i-1;
            int temp = arr[i];
            while (j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }


    public static void main(String[] args) {
        int arr[] = {5,1,0,2,6,8,3,9,4,7,19,13,-1};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
