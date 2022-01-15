package com.hsc.algorithm;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    class Node{
        int key;
        int value;
        Node pre;
        Node next;
        public Node(){}
        public Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }

    private Map<Integer,Node> cache = new HashMap<>();
    private int size;
    private int maxSize;
    private Node head;
    private Node tail;

    public LRUCache(int capCity){
        this.maxSize = capCity;
        this.size = 0;
        this.head = new Node();
        this.tail = new Node();
        this.head.next = tail;
        this.tail.pre = head;
    }
    public int get(int key){
       Node node = cache.get(key);
       if(null == node){
           return -1;
       }
       moveTohead(node);
       return node.value;
    }
    public void put(int key,int value){
        Node node = cache.get(key);
        if(null == node){
           Node newNode = new Node(key,value);
           cache.put(key,newNode);
           size++;
           if(size > maxSize){
             Node deleteNode = deleteNode();
             cache.remove(deleteNode.key);
             size--;
           }
        }else{
            node.value = value;
            cache.put(key,node);
            moveTohead(node);
        }
    }
    public void moveTohead(Node node){
        Node temp = head.next;
        head.next = node;
        node.pre = head;
        node.next = temp;
        temp.pre = node;
    }
    public Node deleteNode(){
        Node node = tail.pre;
        node.pre.next = tail;
        tail.pre = node.pre;
        return node;
    }
}
