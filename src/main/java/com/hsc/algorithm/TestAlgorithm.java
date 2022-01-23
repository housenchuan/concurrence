package com.hsc.algorithm;

import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;

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

    public static void quickSort1(int arrs[],int left, int right){
        int temp = arrs[left];
        int l = left;
        int r = right;
        while (l < r){
             while(l<r && arrs[r]>temp){
                 r--;
             }
             if(l<r){
                 arrs[l] = arrs[r];
                 l++;
             }
             while (l<r && arrs[l]<temp){
                 l++;
             }
             if(l<r){
                 arrs[r] = arrs[l];
                 r--;
             }
        }
        arrs[l] = temp;
        quickSort1(arrs,left,l-1);
        quickSort1(arrs,l+1,right);
    }

    public static int findMaxProfit1(int arrs[]){
        int min = arrs[0];
        int maxProfit = 0;
        for (int i = 0; i < arrs.length; i++) {
            maxProfit = Math.max(arrs[i]-min,maxProfit);
            min = Math.min(arrs[i],min);
        }
        return maxProfit;
    }

    public static Node reserveLink1(Node node){
        Node pre = null;
        Node cur = node;
        while (node != null){
            Node next = node.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static int search1(int arrs[],int target){
        int l = 0;
        int r = arrs.length-1;
        while (l<=r){
            int mid = (l+r)/2+l;
            if(target == arrs[mid]){
                return mid;
            }else if(target > arrs[mid]){
                l = mid+1;
            }else if(target < arrs[mid]){
                r = mid-1;
            }
        }
        return  -1;
    }

    public static String addStrings(String str1,String str2){
        int len1 = str1.length()-1;
        int len2 = str2.length()-1;
        StringBuilder stringBuilder = new StringBuilder();
        int temp = 0;
        while (len1>=0 || len2>=0 || temp>0 ){
            int num1 = len1>=0?str1.charAt(len1)-'0':0;
            int num2 = len2>=0?str2.charAt(len2)-'0':0;
            int sum = num1+num2;
            temp = sum%10;
            stringBuilder.append(sum/10);
        }
        return stringBuilder.reverse().toString();
    }

    class Node{
        String value;
        Node next;
    }

    public static void deadLock() {
            Object lock1 = new Object();
            Object lock2 = new Object();
            Runnable taskOne = ()-> {
                synchronized (lock1) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lock2) {

                    }
                }
            };
            Runnable taskTwo = () -> {
                synchronized (lock2) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lock1) {

                    }
                }
            };

            new Thread(taskOne).start();
            new Thread(taskTwo).start();
        }

    public static void maopaoSort(int arrs[]){
        for (int i = 0; i < arrs.length-1; i++) {
            for (int j = 0; j <arrs.length-1-i; j++) {
                if(arrs[j]>arrs[j+1]){
                    int temp = arrs[j+1];
                    arrs[j+1] = arrs[j];
                    arrs[j] = temp;
                }
            }
        }
    }    
        
    public static void main(String[] args) {
//        System.out.println(140&255);
//        System.out.println(252&255);
//        System.out.println(20&255);
//        System.out.println(68&240);
//        deadLock();
//        ThreadPoolExecutor
//        int arrs[] = {1,2,3,6,7};
//        int temp = arrs[0]-arrs[1];
//        List<Integer> list =  new ArrayList<Integer>();
//        for (int i = 0; i < arrs.length-1; i++) {
////             temp = Math.max(temp,arrs[i]-arrs[i+1]);
//            list.add(arrs[i]-arrs[i+1]);
//        }
//        for (Integer i : list) {
//            System.out.println(i);
//        }
//        System.out.println(temp);
//        maopaoSort(arrs);
//        for (int i = 0; i < arrs.length; i++) {
//            System.out.println(arrs[i]);
//        }
//        HashMap map = new HashMap<>();


        String str1 = "abba";
        System.out.println(str1.substring(0,2));

    }
}
