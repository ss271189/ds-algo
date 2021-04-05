package com.ss.practice.problem;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    final Node head=new Node();
    final Node tail=new Node();
    Map<Integer,Node> cache=null;
    int cacheCapacity;

    public LRUCache(int initialCapacity){
       cache=new HashMap<>(initialCapacity);
       cacheCapacity=initialCapacity;
       head.prev=null;
       head.next=tail;
       tail.prev=head;
       tail.next=null;
    }

    public void add(Node newNode){
        // Adding the new node in front
        Node tempHeadNext=head.next;

        newNode.prev=head;
        newNode.next=tempHeadNext;
        tempHeadNext.prev=newNode;
        head.next=newNode;
        //display();
        //displayReverse();
    }

    public void remove(Node node){
        // removing node
        // Getting prev and next node
        Node prevNode=node.prev;
        Node nextNode=node.next;
        nextNode.prev=prevNode;
        prevNode.next=nextNode;
        display();
    }

    public int get(int key){
        int result=-1;
        Node node=cache.get(key);
        if(node!=null){
            remove(node);
            add(node);
            result = node.val;
        }
       return result;
    }

    public void put(int key, int val){
        Node node=cache.get(key);
        if(node!=null){
            remove(node);
            node.val=val;
            add(node);
        } else {
            if(cacheCapacity==cache.size()){
                cache.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node newNode=new Node();
            newNode.val=val;
            newNode.key=key;
            add(newNode);
            cache.put(key,newNode);
        }
    }

    public void display(){
        System.out.print("Displaying key value in cache -> [");
        Node tempHead=head.next;
        while (tempHead!=tail){
            System.out.print("{"+tempHead.key+" "+tempHead.val+"}");
            tempHead=tempHead.next;
        }
        System.out.println("]");
    }

    public void displayReverse(){
        System.out.print("Displaying key value in cache -> [");
        Node tempTail=tail.prev;
        while (tempTail!=head){
            System.out.print("{"+tempTail.key+" "+tempTail.val+"}");
            tempTail=tempTail.prev;
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        LRUCache lru=new LRUCache(5);
        lru.display();
        lru.displayReverse();
        lru.put(1,1);
        lru.put(2,2);
        lru.put(3,3);
        lru.display();
        lru.get(2);
        lru.display();
        lru.get(1);
        lru.display();
        lru.displayReverse();
    }

    class Node{
        int key;
        int val;
        Node prev;
        Node next;
    }
}
