package com.ss.practice;

public class ListProblem {
    /*
        // 1 -> 2 -> 3 -> 4 -> null
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));*/
// 4 -> 3 -> 2 -> 1 -> null
//node = reverse(node);
    public static void main(String[] args) {




        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
        System.out.println("Before reversing");
        ListNode temp=node;
        while(node!=null){
            System.out.print(node.value+"->");
            node=node.next;
        }
        node=reverse(temp);
        System.out.println("After reversing");
        while(node!=null){
            System.out.print(node.value+"->");
            node=node.next;
        }

    }
    public static ListNode reverse(ListNode firstNode) {
        ListNode current=firstNode;
        ListNode next;
        ListNode returnNode=null;
        while(current!=null){
            next=current.next;
            current.next=returnNode;
            returnNode=current;
            current=next;
        }
       /* while (node != null) {
            ListNode n = new ListNode(node.value, returnNode);
            returnNode = n;
            node = node.next;
        }*/
        return returnNode;
    }
}

class ListNode {
    int value;
    ListNode next;

    ListNode(int val, ListNode node) {
        this.value = val;
        this.next = node;
    }
}