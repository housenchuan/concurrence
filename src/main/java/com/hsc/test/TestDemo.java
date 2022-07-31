package com.hsc.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestDemo {



    List<List<Integer>> res = null;
    List<Integer> path = null;
    int target = 0;
    int sum = 0;
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        res = new ArrayList<>();
        if(null == root) return res;
        path = new ArrayList<>();

        this.target = target;
        sum+=root.val;
        path.add(root.val);
        pre(root);
        return res;
    }

    public void pre(TreeNode root){
        if(sum > target) return;
        if(sum == target) {
            if(null==root.left && null==root.right) res.add(new ArrayList<>(path));
            return;
        }
        if(null != root.left) {
            sum+=root.left.val;
            path.add(root.left.val);
            pre(root.left);
            sum-=root.left.val;
            path.remove(path.size()-1);
        }

        if(null != root.right) {
            sum+=root.right.val;
            path.add(root.right.val);
            pre(root.right);
            sum-=root.right.val;
            path.remove(path.size()-1);
        }
    }


    public static int nthUglyNumber(int n) {
        //动态规划
        int a=0,b=0,c=0;
        int dp[] = new int[n];
        dp[0]=1;
        for(int i=1; i<n; i++){
            int n2 = dp[a]*2, n3 = dp[b]*3, n5 = dp[c]*5;
            dp[i] = Math.min(Math.min(n2,n3),n5);
            if(dp[i]==n2) a++;
            if(dp[i]==n3) b++;
            if(dp[i]==n5) c++;
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
//        TestDemo demo = new TestDemo();
//        TreeNode root = new TreeNode(1,new TreeNode(-2,null,null),new TreeNode(-3,null,null));
//        demo.pathSum(root,-5);
//        System.out.println(demo.res);
//        System.out.println(-2+(-3));

//          System.out.println()
        System.out.println(2*2*2*2*2*2);
    }
}
