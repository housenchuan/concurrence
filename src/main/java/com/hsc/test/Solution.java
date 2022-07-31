package com.hsc.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    List<String> resultList = new ArrayList<>();
    List<String> path = new ArrayList<>();
    boolean used[] = null;
    public String[] permutation(String s) {
        used = new boolean[s.length()];
        String arr[] = s.split("");
        Arrays.sort(arr);
        backTrack(arr);
        String resultArr [] = new String [arr.length];
        return resultList.toArray(resultArr);
    }
    public void backTrack(String arr[]){

        if(path.size() == arr.length){
            resultList.add(String.join("",path));
            return;
        }
        for(int i=0; i<arr.length; i++){
            if(i>0 && arr[i].equals(arr[i-1]) && !used[i-1]){
                continue;
            }
            if(!used[i]){
                used[i]=true;
                path.add(arr[i]);
                backTrack(arr);
                used[i]=false;
                path.remove(path.size()-1);
            }
        }
    }


    public  static int[] singleNumbers(int[] nums) {
        int result[] = new int[2];
        int a = 0;
        int b = 0;
        for(int i=0;i<nums.length;i++){
            if(a==0||b==0){
                if(a == 0) {
                    result[0] = nums[i];
                    a++;
                }else if(b == 0) {
                    if(nums[i]==result[0]){
                        a=0;
                        continue;
                    }
                    result[1] = nums[i];
                    b++;
                }
            }else{
                if(nums[i] == result[0]) a=0;
                if(nums[i] == result[1]) b=0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(1100&0010);

    }
}