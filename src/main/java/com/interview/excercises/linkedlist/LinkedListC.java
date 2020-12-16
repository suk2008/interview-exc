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

    public void addAtPosition(int value, int Position){
        if(Position<0){ Position = 0; }
        if(Position >size){ Position = size; }
        Node tempNode = new Node();
        if(headNode == null){
            headNode = tempNode;
        }
        else if(Position == 0){
            tempNode.data = value;
            tempNode.next = headNode;
            headNode = tempNode;
        }
        else{
            tempNode = headNode;
            for(int i=0; i<Position; i+=1) tempNode = tempNode.next;
            Node newNode = new Node();
            newNode.data = value;
            newNode.next = newNode.next;
            tempNode = newNode;
        }
        size += 1;
    }

    public void iterateMiddleToLast(){

        Node fast = headNode;
        Node slow = headNode;

        if(headNode == null){
            System.out.println("headnode is null");
            return;
        }

        while(fast!= null && fast.next!=null){
            fast= fast.next.next;
            slow = slow.next;
            //whoever reaches first will break the condition. fast will be at end at first and slow will be in middle of the list.
        }
        while(slow != null){
            System.out.println(slow.data);
            slow = slow.next;
        }
    }
    public void createLoop(){
        Node tempNode = headNode;
        tempNode = tempNode.next.next;
        tempNode.next = headNode;
    }

    public boolean detectLoop(){
        Node slow = headNode;
        Node fast = headNode;

        while(slow!=null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}


