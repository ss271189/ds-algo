package com.ss.practice.stack;

public class StackPractice {

    public static void main(String[] args) {
        Node head = null;
        StackPractice sp = new StackPractice();
        head = sp.push(head, 25);
        head = sp.push(head, 26);
        head = sp.push(head, 27);
        sp.display(head);
        //head = sp.pop(head);
        head=sp.reverse(head);
        sp.display(head);
    }

    public Node push(Node head, int val) {
        Node newNode = new Node();
        newNode.val = val;
        newNode.next = head;
        return newNode;
    }

    public Node pop(Node head) {
        Node removedNode = head;
        System.out.println("Item popped out of Stack is " + head.val);
        return head.next;
    }

    public void display(Node head) {
        if (head == null) {
            System.out.println("Nothing to display!!! Stack empty");
            return;
        }
        System.out.print("Displaying items in stack... ");
        do {
            System.out.print(head.val + " => ");
            head = head.next;
        } while (head != null);
        System.out.println();
    }

    public Node reverse(Node head) {
        if(head==null) {
            System.out.println("Empty stack received ....");
            return null;
        }
        Node newHead=null;
        while(head!=null){
          newHead=push(newHead,head.val);
          head=head.next;
        }
        display(newHead);
        return newHead;
    }

    class Node {
        int val;
        Node next;
    }

}
