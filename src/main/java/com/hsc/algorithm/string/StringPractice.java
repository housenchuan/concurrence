package com.hsc.algorithm.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringPractice {

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
     * 查找最长回文串--中心扩展算法
     * 时间复杂度O(n2)
     * 空间复杂度O(1)
     */
    public static String longestHwStr_1(String str){
        if(str.length()<=1){
            return str;
        }
        int startIndex = 0;
        int maxLength = 0;
        for(int i=0; i<str.length(); i++){
            int maxTempLen1 = strExtendsLength(str,i,i);
            int maxTempLen2 = strExtendsLength(str,i,i+1);
            int maxTempLen = Math.max(maxTempLen1,maxTempLen2);
            if (maxTempLen > maxLength){
                startIndex = i-(maxTempLen-1)/2;
                maxLength = maxTempLen;
            }
        }
        return str.substring(startIndex,startIndex+maxLength);
    }
    public static int strExtendsLength(String str,int left,int right){
        while(left>=0 && right<str.length() && str.charAt(left) == str.charAt(right)){
            //说明两个字符是相等的则继续向左向右拓展
            left--;
            right++;
        }
        //这边表示边界到了 或者左右的字符开始不相等了
        return right-left-1;
    }

    /**
     * 查找最长回文串--动态规划
     * 时间复杂度O(n2)
     * 空间复杂度O()
     */
    public static String longestHwStr_2(String str){
        if(str.length()<2){
            return str;
        }
        char[] arr = str.toCharArray();
        boolean dp[][] = new boolean[arr.length][arr.length];
        for (int i = 0; i <arr.length; i++) {
            dp[i][i]=true;
        }
        int maxLen = 1;
        int start = 0;
        for (int L = 2; L <= arr.length; L++) {
            for (int i = 0; i < arr.length; i++) {
                int j = i+L-1;
                if(j>=arr.length){
                    break;
                }
                if(str.charAt(i) != str.charAt(j)){
                    dp[i][j] = false;
                }else{
                    if(j-i<3){//aba 这种情况
                        dp[i][j] = true;
                    }else{ //abba or abeba
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                int tempLen = j-i+1;
                if(dp[i][j] && tempLen>maxLen){
                    maxLen = tempLen;
                    start = i;
                }
            }
        }
        return str.substring(start,start+maxLen);
    }

    public static void main(String[] args) {
        System.out.println(longestHwStr_2("babad"));
    }
}
