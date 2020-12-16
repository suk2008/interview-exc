package com.interview.excercises;

import com.interview.excercises.linkedlist.LinkedListC;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        LinkedListC  list = new LinkedListC<>();
        list.addAtHead(1);
        list.addAtHead(3);
        list.addAtHead(4);
        //list.createLoop();
        System.out.println(list.detectLoop());
        //list.addAtPosition(2,0);
        //list.iterateMiddleToLast();
        //list.printAll();
    }
}
