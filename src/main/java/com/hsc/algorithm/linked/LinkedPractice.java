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

    /**
     * 给定一个链表，如果它是有环链表，实现一个算法返回环路的开头节点。若环不存在，请返回 null。
     * 环路检测
     * hash表
     * 时间复杂度O(n)
     * 空间复杂度O(n)
     */
    public static Node cycleNode_1(Node head){

        return null;
    }
    /**
     * 给定一个链表，如果它是有环链表，实现一个算法返回环路的开头节点。若环不存在，请返回 null。
     * 环路检测
     * 快慢指针 a=c+(n-1)(a+b)
     *     主要亮点：1.快指针走过的路径是慢指针的两倍  2.头节点到环的起始点的距离等于快慢指针交点到环的起始点的距离。
     * 时间复杂度O(n)
     * 空间复杂度O(1)
     */
    public static Node cycleNode_2(Node head){
        Node fast = head;
        Node slow = head;
        while (fast != null){//没有环的情况下 链表遍历完截止
            slow = slow.next;
            if(null != fast.next){
                fast = fast.next.next;
            }else{
                return null;
            }
            if(fast == slow){//说明有环了,找到它
                Node pre = head;
                while (pre != slow){
                    pre=pre.next;
                    slow=slow.next;
                }
                return pre;
            }
        }
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