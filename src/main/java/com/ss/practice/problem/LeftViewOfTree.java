package com.ss.practice.problem;

import java.util.ArrayList;
import java.util.List;

public class LeftViewOfTree {

    int maxLevel=0;
    public void leftView(Node root,int level, List<Integer> result){
        if(root==null)
            return;
        if(maxLevel< level){
            result.add(root.val);
            maxLevel++;
        }
        leftView(root.left,level+1,result);
        leftView(root.right,level+1,result);
    }

    public static void main(String[] args) {
        Node root=new Node(1);
         root.left=new Node(2);
         root.right=new Node(3);
         root.left.left=new Node(4);
         root.right.left=new Node(5);
         root.right.left.right=new Node(6);
         List<Integer> list=new ArrayList<>();
        LeftViewOfTree obj=new LeftViewOfTree();

        obj.leftView(root,1,list);
        System.out.println(list);



    }





 static class Node {
        Node(int val){
            this.val=val;
        }
     int val;
     Node left;
     Node right;

 }

}
