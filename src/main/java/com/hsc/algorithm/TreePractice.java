package com.hsc.algorithm;

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