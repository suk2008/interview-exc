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


        list.printAll();
    }
}
