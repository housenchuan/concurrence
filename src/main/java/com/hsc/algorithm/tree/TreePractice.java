package com.hsc.algorithm.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class TreePractice {
    /**
     *前序遍历
     */
    public static void before(TreeNode tree){
        print(tree);
        if(null != tree.left)before(tree.left);
        if(null != tree.right)before(tree.right);
    }
    /**
     *中序遍历
     */
    public static void mid(TreeNode tree){
        if(null != tree.left)mid(tree.left);
        print(tree);
        if(null != tree.right)mid(tree.right);
    }
    /**
     *后序遍历
     */
    public static void after(TreeNode tree){
        if(null != tree.left)after(tree.left);
        if(null != tree.right)after(tree.right);
        print(tree);
    }
    /**
     *层序遍历
     * 通过队列去实现
     */
    public static void layer(TreeNode tree){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(tree);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            print(node);
            if(null != node.left){
                queue.offer(node.left);
            }
            if(null != node.right){
                queue.offer(node.right);
            }
        }
    }

    /**
     *二叉树的最近公共祖先--递归
     * 中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
     */
    public static TreeNode  lowestCommonAncest_1(TreeNode root, TreeNode p, TreeNode q) {
        return null;
    }
    /**
     *二叉树的最近公共祖先--hash存储父节点
     * 中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
     */
    public static TreeNode  lowestCommonAncest_2(TreeNode root, TreeNode p, TreeNode q) {
        return null;
    }

    public static void print(TreeNode tree){
        System.out.print(tree.name);
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode("A");
        TreeNode b = new TreeNode("B");
        TreeNode c = new TreeNode("C");
        a.left = b;
        a.right = c;
        TreeNode d = new TreeNode("D");
        TreeNode e = new TreeNode("E");
        b.left = d;
        b.right = e;
        TreeNode f = new TreeNode("F");
        TreeNode g = new TreeNode("G");
        c.left = f;
        c.right = g;
        before(a);
        System.out.println("......前序遍历......");
        mid(a);
        System.out.println("......中序遍历......");
        after(a);
        System.out.println("......后续遍历......");
        layer(a);
        System.out.println("......层序遍历......");
        Random random = new Random();
        while (true) {
            System.out.println(random.nextInt(7)+1);
        }
    }
}

class TreeNode{
    String name;
    TreeNode left;
    TreeNode right;
    public TreeNode(String name){
        this.name = name;
    }
}