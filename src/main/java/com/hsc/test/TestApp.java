package com.hsc.test;

import org.jcp.xml.dsig.internal.dom.DOMSubTreeData;
import org.springframework.context.ApplicationContext;

import java.util.*;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class TestApp {
    public  static int translateNum(int num) {
        String arr[] = (num+"").split("");
        int count = 1;
        for(int i=0; i<arr.length-1; i++){
            int temp = Integer.valueOf((arr[i]+arr[i+1])).intValue();
            if(temp>=10 && temp<=25) count++;
        }
        return count;
    }
    public  static int lengthOfLongestSubstring(String s) {
        //pwwkew
        Map<Character, Integer> dic = new HashMap<>();
        int res = 0, tmp = 0;
        for(int j = 0; j < s.length(); j++) {
            int i = dic.getOrDefault(s.charAt(j), -1); // 获取索引 i
            dic.put(s.charAt(j), j); // 更新哈希表
            tmp = tmp < j - i ? tmp + 1 : j - i; // dp[j - 1] -> dp[j]
            res = Math.max(res, tmp); // max(dp[j - 1], dp[j])
        }
        return res;
    }

    public static String reverseWords(String s) {
        StringBuilder resultStr = new StringBuilder();
        String arr[] = s.trim().split(" ");
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i].equals(""))continue;
            if(i!=0){
                resultStr.append(arr[i]).append(" ");
            }else{
                resultStr.append(arr[i]);
            }
        }
        return resultStr.toString();
    }

    public  static int doSearch(String s, int l, int r,int k){
        int maxLen = 0;
        int arr[] = new int[26];
        //1.count the number occurrences of characters
        for(int i=l; i<=r; i++){
            arr[s.charAt(i)-'a'] ++;
        }
        //2.find characters with values less than k
        char c = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0 && arr[i]<k)c=(char)('a'+i);
        }
        if(c==0) return r-l+1;
        for(int i=l; i<r; i++){
            while(i<r && s.charAt(i)==c)i++;
            if(i>r)break;
            int start = i;
            while(i<r && s.charAt(i)!=c)i++;
            maxLen=Math.max(maxLen,doSearch(s,start,i-1,k));
        }
        return maxLen;
    }



    public static int calculate(String s) {
        //3+2*4
        Deque<Integer> stack = new LinkedList<>();
        int num = 0;
        char pre='+';
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                num = num*10+(c-'0');
            }else if(!Character.isDigit(c) && c !=' ' || i==s.length()-1){
                switch(pre){
                    case '+' : stack.push(num);break;
                    case '-' : stack.push(-num);break;
                    case '*' : stack.push(stack.pop()*num);break;
                    case '/' : stack.push(stack.pop()/num);break;
                }
                pre=c;
                num=0;
            }
        }
        int ret=0;
        while(stack.size()!=0){
            ret+=stack.pop();
        }
        return ret;
    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //二分法处理
        int n = nums1.length;
        int m = nums2.length;
        int left = (m+n+1)/2;
        int right = (m+n+2)/2;
        return (getKth(nums1,0,n-1,nums2,0,m-1,left)+getKth(nums1,0,n-1,nums2,0,m-1,right))*0.5;

    }
    //找到两个数组中第k小的数组
    public static int getKth(int [] num1,int start1,int end1, int [] num2, int start2, int end2,int k){
        int len1 = end1-start1+1;
        int len2 = end2-start2+1;

        if(len1>len2) return getKth(num2,start2,end2,num1,start1,end1,k);
        if(len1 == 0) return num2[start2+k-1];

        if(k==1) return Math.min(num1[start1],num2[start2]);

        int i = start1+Math.min(len1,k/2)-1;
        int j = start2+Math.min(len2,k/2)-1;
        if(num1[i]>num2[j]){
            return getKth(num1,start1,end1,num2,j+1,end2,k-(j-start2+1));
        }else{
            return getKth(num1,i+1,end1,num2,start2,end2,k-(i-start1+1));
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        int i=0,j=nums.length-1;
        while(i<j){
            while(i<j && nums[i]+nums[j]<target) i++;
            while(i<j && nums[i]+nums[j]>target) j--;
            if(i<j){
                arr[0]=nums[i];
                arr[1]=nums[j];
            }
        }
        return arr;
    }


    public static boolean isStraight(int[] nums) {
        int count=0;
        int zore=0;
        Arrays.sort(nums);
        int temp = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] == 0){
                zore++;
            }else{
                if(nums[i]==nums[i-1])return false;
                if(nums[i-1]!=0){
                    count+=(nums[i]-temp-1);
                }
            }
            temp = nums[i];
        }
        return zore>=count?true:false;
    }



    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int index=0;
        for(int num: pushed){
            stack.push(num);
            while(!stack.isEmpty() && stack.peek()==popped[index]){
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }

    public static boolean verifyPostorder(int[] postorder) {
        Stack<Integer> stack = new Stack<>();
        int root = Integer.MAX_VALUE;
        for(int i=postorder.length-1; i>=0; i--){
            if(postorder[i]>root) return false;
            while(!stack.isEmpty() && stack.peek()>postorder[i]){
                root = stack.pop();
            }
            stack.add(postorder[i]);
        }
        return true;
    }


    public static char firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if('z' == c){
                System.out.println();
            }
            if(null == map.get(c)){
                map.put(c,1);
                queue.offer(c);
            }else{ //z c
                map.put(c,-1);
                while(!queue.isEmpty() && map.get(queue.peek())==-1){
                    queue.poll();
                }
            }
        }
        return queue.isEmpty()?' ':queue.poll();
    }

    public static int[] singleNumbers(int[] nums) {
        int x=0,y=0,n=0,m=1;
        for(int num : nums){
            n^=num;
        }
        while((n&m) == 0)m<<=1;
        for(int num:nums){
            if((num&m) != 0)x^=num;
            else y^=num;
        }
        return new int[]{x,y};
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.toArray();

    }
}
