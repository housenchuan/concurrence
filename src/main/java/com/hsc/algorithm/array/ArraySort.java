package com.hsc.algorithm.array;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    int temp[];
    /**
     * 1.冒泡排序-基础版【稳定】
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
     * 1.1 冒泡排序-优化版【稳定】
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
     * 2.选择排序【不稳定】
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
     * 3.插入排序【稳定】
     * 每一步都将一个待排数字插入到已经排序序列的适当位置，直到全部插入为止
     */
    public static void insertSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
//            int j=i-1;
//            int temp = arr[i];
//            while (j>=0 && arr[j]>temp){
//                arr[j+1] = arr[j];
//                j--;
//            }
//            arr[j+1] = temp;
            for (int j = i; j>0 ; j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else break;
            }
        }
    }

    /**
     * 4.希尔排序-插入排序优化版【不稳定】
     *  对数组进行分组，组内使用插入排序
     */
    public static void shellSort(int arr[]){
        for (int gap = arr.length/2; gap>0; gap/=2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j>0 ; j-=gap) {
                    if(j>=gap && arr[j-gap]>arr[j]){
                        int temp = arr[j];
                        arr[j] = arr[j-gap];
                        arr[j-gap] = temp;
                    }else break;
                }
            }
        }
    }


    /**
     * 5.归并排序-分治【稳定】
     * 时间复杂度:O(nlogn)
     * 空间复杂度:O(n)
     */
    public static void mergeSort(int arr[]){
        int temp[] = new int[arr.length];
        sort(temp,arr,0,arr.length-1);
    }
    //分
    public static void sort(int temp[],int arr[],int l,int r){
        if(l==r) return;
        int mid = l+(r-l)/2;
        sort(temp,arr,l,mid);
        sort(temp,arr,mid+1,r);
        merge(temp,arr,l,mid,r);
    }
    //治(将两个数组合并)
    public static void merge(int temp[],int arr[],int l,int mid,int r){
        for(int i=l;i<=r;i++) temp[i] = arr[i];
        int cnt = l;
        int i=l,j=mid+1;
        while (i<=mid || j<=r){
            if(i>mid) arr[cnt++] = temp[j++];
            else if(j>r) arr[cnt++] = temp[i++];
            else if(temp[i]<temp[j]) arr[cnt++] = temp[i++];
            else arr[cnt++] = temp[j++];
        }
    }

    /**
     *6.快速排序【不稳定】
     * 时间复杂度：O(nlogn)
     * 空间复杂度：O(logn)
     */
    public static void quickSort(int arr[],int left,int right){
        if(left >= right)return;
        int l = left;
        int r = right;
        int temp = arr[l];
        while (l<r){
            while (l<r && arr[r]>temp) r--;
            if(l<r){
                arr[l] = arr[r];
                l++;
            }
            while (l<r && arr[l]<temp) l++;
            if(l<r){
                arr[r] = arr[l];
                r--;
            }
        }
        arr[l] = temp;
        quickSort(arr,left,r-1);
        quickSort(arr,r+1,right);
    }

    /**
     *7.堆排序【不稳定】
     * 时间复杂度：O(nlogn)
     * 空间复杂度：O(1)
     */
    public static void heapSort(int arr[]){

    }

    public static void main(String[] args) {
        int arr[] = {5,1,0,2,6,8,3,9,4,7,19,13,-1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
