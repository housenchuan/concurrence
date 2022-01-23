package com.hsc.algorithm.array;

public class ClimbStarisPractice {

    /**
     * 爬楼梯-动态规划
     * @param n 楼梯的层数
     * f(x) = f(x-1)+f(x-2)  第x级的方案总数 等于在x-1级一次性爬一级来达到x层 加上 在x-2级一次性爬二级来达到x层的总方案和
     */
    public static int climbStairs_0(int n){
        if(n==1){
            return 1;
        }
        int [] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <=n ; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];
    }

    /**
     * 爬楼梯-动态规划+滚动数组
     * 斐波那契数列，从第三项开始，没一项都等于前两项之和
     * @param n 楼梯的层数
     * f(x) = f(x-1)+f(x-2)  第x级的方案总数 等于在x-1级一次性爬一级来达到x层 加上 在x-2级一次性爬二级来达到x层的总方案和
     */
    public static int climbStairs_1(int n){
        if(n==1)return 1;
        int first = 1;
        int second = 2;
        int third = 0;
        for (int i = 3; i <=n ; i++) {
            third=first+second;
            first=second;
            second=third;
        }
        return second;
    }

    /**
     * 爬楼梯-递归
     * @param n 楼梯的层数
     * f(x) = f(x-1)+f(x-2)  第x级的方案总数 等于在x-1级一次性爬一级来达到x层 加上 在x-2级一次性爬二级来达到x层的总方案和
     * 时间复杂度O(n2)
     * 空间复杂度O(n)
     */
    public static int climbStairs_2(int n){
        if(n==1)return 1;
        if(n==2)return 2;
        return climbStairs_2(n-1)+climbStairs_2(n-2);
    }

    /**
     * 爬楼梯-记忆化递归
     * 记录计算的结果，避免重复计算
     * 时间复杂度O(n)
     * 空间复杂度O(n)
     */
    public static int climbStairs_3(int n){
        int memo[] = new int[n+1];
        return doClimb(memo,n);
    }
    public static int doClimb(int memo[],int n){
        if(memo[n]>0)return memo[n];
        if(n==1){
            memo[n]=1;
        }else if(n==2){
            memo[n]=2;
        }else{
            memo[n] = doClimb(memo,n-1)+doClimb(memo,n-2);
        }
        return memo[n];
    }

    /**
     * 爬楼梯-通项公式（斐波那契数列，从第三项开始，每一项都等于前两项之和）
     * @param n 楼梯的层数
     * f(x) = f(x-1)+f(x-2)  第x级的方案总数 等于在x-1级一次性爬一级来达到x层 加上 在x-2级一次性爬二级来达到x层的总方案和
     */
    public static int climbStairs_4(int n){
        double sqrt5 = Math.sqrt(5);
        double fibn = Math.pow((1+sqrt5)/2,n)-Math.pow((1-sqrt5)/2,n);
        return (int)Math.round(fibn/sqrt5);
    }

}
