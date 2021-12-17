package com.hsc.algorithm;

import java.util.Arrays;

/**
 * 算法练习
 */
public class TestAlgorithm {

    public static void quickSort(int arrs[],int left,int right){
        if(left>=right)return;
        int l = left;
        int r = right;
        int temp = arrs[l];
        while (l<r) {
            while (l < r && arrs[r] > temp) {
                r--;
            }
            if (l < r) {
                arrs[l] = arrs[r];
                l++;
            }
            while (l < r && arrs[l] < temp) {
                l++;
            }
            if (l < r) {
                arrs[r] = arrs[l];
                r--;
            }
        }
        arrs[l] = temp;
        quickSort(arrs,left,l-1 );
        quickSort(arrs,l+1,right);
    }
    public static int search(int arrs[],int target){
        int left = 0;
        int right = arrs.length-1;
        while(left<=right){
            int mid = (left+right)/2+left;
            if(arrs[mid] == target){
                return mid;
            }else if(target<arrs[mid]){
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(140&255);
        System.out.println(252&255);
        System.out.println(20&255);
        System.out.println(68&240);
    }
}
