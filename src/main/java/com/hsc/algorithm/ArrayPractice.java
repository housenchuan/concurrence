package com.hsc.algorithm;


import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayPractice {


    /**
     * 快速排序
     * 1). 先从数列中取出一个数作为基准数。
     * 2). 分区过程，将比这个数大的数全放到它的右边，小于或等于它的数全放到它的左边。
     * 3). 再对左右区间重复第二步，直到各区间只有一个数。
     * @param arr 待排序数组
     * @param start 开始下标
     * @param end 结束下标
     */
    public static void quickSort(int arr[],int start,int end){
        int s = start;
        int e = end;
        if(start>=end){
            return;
        }
        int temp = arr[start];
        while (s<e){
            while (s<e && arr[e]>temp){
                e--;
            }
            if(s<e){
                arr[s] = arr[e];
                s++;
            }
            while(s<e && arr[s]<temp){
                s++;
            }
            if(s<e){
                arr[e] = arr[s];
                e--;
            }
        }
        arr[s] = temp;
        quickSort(arr,start,s-1);
        quickSort(arr,s+1,end);
    }

    /**
     * 买卖股票的最佳时机
     * 给定一个数组 prices ，它的第i个元素prices[i] 表示一支给定股票第 i 天的价格。
     * 你只能选择某一天买入这只股票，并选择在未来的某一个不同的日子卖出该股票。设计一个算法来计算你所能获取的最大利润。
     * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0
     * 注意卖出价格需要大于买入价格，同时不能在买入之前卖出。
     * @param prices 股票每天的价格数组
     * 思路：动态规划 一般常用于最优解，把大问题分解成小问题，然后通过小问题的解得到原问题的解。
     */
    public static int maxProfits(int prices[]){
        int max = 0;
        int min = prices[0];
        for (int k = 0; k < prices.length; k++) {
            max = Math.max(max,prices[k]-min);
            min = Math.min(min,prices[k]);
        }
        return max;
    }

    /**
     * 二分法查找--前提是数组是有序的
     * 思路：设left和right分别为数组的开始和结束位置，判断mid是否等于target值，若小于则往数组的
     *      左边进行寻找，若大于则往数组的右边进行寻找
     * 时间复杂度：O(logn)
     * 空间复杂度: O(1)
     * @param nums 待查找数组--数组是升序的
     * @param target 目标值
     * @return 目标值的下标
     */
    public static int search(int nums[],int target){
        for (int left = 0,right = nums.length-1; left <= right;) {
            int mid = (right - left)/2 + left;
            if(nums[mid] == target){
                return mid;
            }else if(target > nums[mid]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }

    /**
     * 字符串相加
     *     8 5 4 3
     * +   2 4 5 6
     * = 1 0 9 9 9
     * @return 字符串相加的结果
     */
    public static String addStrings(String num1, String num2){
        StringBuilder sb = new StringBuilder("");
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        while (i>=0 || j>=0 || carry!=0){
            int n1 = i>=0?num1.charAt(i)-'0':0;
            int n2 = j>=0?num2.charAt(j)-'0':0;
            int tmp = n1+n2+carry;
            carry = tmp/10;
            sb.append(tmp%10);
            i--;
            j--;
        }
        return sb.reverse().toString();
    }


    /**
     * 堆排序
     * 大顶堆：完全二叉树且节点大于等于其左右子节点
     * 小顶堆：完全二叉树且节点小于等于其左右子节点
     * 思路：
     *  1.构建大顶堆，上浮操作建堆，下沉操作建堆
     *  2.排序 将堆顶的元素与数组末尾的元素进行交换，然后重新构建大顶堆，重复此操作
     */
    public static void stackSort(int arrs[]){
        //1.构建大顶堆 首先从非叶子节点开始进行下沉操作
        for (int i = arrs.length/2-1; i >=0 ; i--) {
            buildBigStack(arrs,i,arrs.length);
        }
        //2.排序
        for (int i = arrs.length-1; i > 0; i--) {
            swap(arrs,0,i);
            buildBigStack(arrs,0,i);
        }
    }
    public static void buildBigStack(int arrs[],int i,int length){
        for (int k=2*i; k+1< length; k=2*k) {
            if(k+1<length && arrs[k]<arrs[k+1]){
                k++;
            }
            if(arrs[i] < arrs[k]){
                swap(arrs,i,k);
                i = k;
            }else{
                break;
            }
        }
    }
    public static void swap(int arrs[],int a,int b){
        int temp = arrs[a];
        arrs[a] = arrs[b];
        arrs[b] = temp;
    }

    /**
     * 在一个长为 字符串中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1
     */
    public static int findAppearOnce(String str){
        Map<String,Integer> map = new LinkedHashMap<String,Integer>();
        for(int i=0;i<str.length();i++){
            String temp = str.charAt(i)+"";
            if(map.get(temp) == null){
                map.put(temp,1);
            }else{
                map.put(temp,-1);
            }
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue().intValue() == 1)return str.indexOf(entry.getKey());
        }
        return -1;
    }

    /**
     * 从两个有序数组中找到中位数
     * 思路：把找到中位数问题的转换成找到第k小的数的问题
     * @param arr1
     * @param arr2
     */
    public static double findMindNum(int arr1[],int arr2[]){
        int totalLen = arr1.length+arr2.length;
        if(totalLen%2==1){
            double mid = findKmin(arr1,arr2,totalLen/2+1);
            return mid;
        }else{
            double mid = (findKmin(arr1,arr2,totalLen/2-1)+findKmin(arr1,arr2,totalLen/2))/2.0;
            return mid;
        }
    }
    public static int findKmin(int arr1[],int arr2[],int k){
        int index1 = 0;
        int index2 = 0;
        while (true) {
            if(index1 == arr1.length){
                return arr1[index1+k-1];
            }
            if(index2 == arr2.length){
                return arr2[index2+k-1];
            }
            if(k == 1){
                return Math.min(arr1[index1],arr2[index2]);
            }
            int half = k / 2;
            int newIndex1 = Math.min(index1 + half, arr1.length) - 1;
            int newIndex2 = Math.min(index2 + half, arr2.length) - 1;
            int num1 = arr1[newIndex1];
            int num2 = arr2[newIndex2];
            if (num1 >= num2) {
                index2 = newIndex2 + 1;
                k -= (newIndex2 - index2 + 1);
            } else {
                index1 = newIndex1 + 1;
                k -= (newIndex1 - index1 + 1);
            }
        }
    }
    public static void main(String[] args) {
//        int arr[] = {1,1,2,3,4,5,7,7,8,9,111,121,12,13,14,15,16,11,11,11,17};
//        stackSort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        System.out.println(findAppearOnce("google"));
        new HashSet<>();
    }
}
