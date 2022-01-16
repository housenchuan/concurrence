package com.hsc.algorithm.linked;

public class LinkedPractice {

    /**
     * 反转链表2.0
     * @param head 待反转链表
     * @return 饭转后的链表
     */
    public static Node reverseLinked(Node head){
        Node pre = null;
        Node cur = head;
        while (cur != null){
            Node temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    /**
     * 链表是否有环形
     * @param head
     * @return
     */
    public static boolean hasCycle(Node head){
        return false;
    }

    /**
     * 相交链表
     * @param headA
     * @param headB
     * @return
     */
    public static Node meetLinked(Node headA,Node headB){
        return null;
    }


    /**
     * 合并两个有序链表
     */
    public Node mergeTwoLists(Node list1, Node list2) {
        return null;
    }

    public static void main(String[] args) {
        Node head = new Node(1,null);
        Node nodeOne = new Node(2,null);
        head.next = nodeOne;
        Node nodeTwo = new Node(3,null);
        nodeOne.next = nodeTwo;
        Node nodeThree = new Node(4,null);
        nodeTwo.next = nodeThree;
        Node nodeFour = new Node(5,null);
        nodeThree.next = nodeFour;

        Node resultNode =  reverseLinked(head);
        Node node = resultNode;
        while (node != null){
            System.out.println(node.value);
            node = node.next;
        }
        System.out.println();

    }

}

class Node{
    int value;
    Node next;

    public Node(int value,Node next){
        this.value = value;
        this.next = next;
    }
}