package com.interview.excercises.linkedlist;

public class LinkedListC<T> {


    int size;
    public Node headNode;

    public LinkedListC(){
        size=0;
        headNode = null;
    }

    public void addAtHead(int value){
        Node tempNode = new Node();
        tempNode.data = value;

        tempNode.next = headNode;
        headNode = tempNode;
    }


}
