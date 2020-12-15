package com.interview.excercises.linkedlist;

public class LinkedListC<T> {


    int size;
    public Node headNode;

    public LinkedListC(){
        size=0;
        headNode = null;
    }

    /**
     *
     * @param value
     */
    public void addAtHead(int value){
        Node tempNode = new Node();
        tempNode.data = value;

        // create temp Node, node.ext = > headMode
        tempNode.next = headNode;
        headNode = tempNode;
        size++;
    }

    public void printAll(){
        Node tempNode = headNode;
        while(tempNode!=null){
           System.out.println(tempNode.data);
           tempNode = tempNode.next;;
        }
    }
    public void isEmpty(){
        if(size == 0){
            System.out.println("List is empty");
        }
    }


}
