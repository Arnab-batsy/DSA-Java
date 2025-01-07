package com.arnab;

import java.util.LinkedList;

public class LL1 {
    public static void main(String[] args) {
        //Linked List doesn't have Continuous Memory allocation.
        //In stead, it stores data in random memory locations distributed throughout the heap and links them.
        //There are no indexes.
        //Nodes- boxes that store each element in the memory.
        //Singly Linked List- Every item, knows about one other item. Ex- 3 loves 4
        //one-sided. 4 has no idea that 3 loves 4.
        //Head- Reference variable that points to the very 1st node.
        //Tail- points to the last node. It doesn't love anyone. Its next is null.
        //Problem- You can't directly access the index.
        //No element has idea about how many total elements are there in the list. You need to traverse.

        LinkedList<Integer> list= new LinkedList<Integer>(); //In built in java
        list.add(24); //Adding an element

        //refer to LL for custom Linked List
        LL li= new LL(); //Creating the object
        li.insertFirst(5);
        li.insertFirst(7);
        li.insertFirst(9);
        li.insertLast(54);
        li.insert(6,9);
        li.deleteFirst();
        li.display();
        li.deleteLast();
        li.display();
        li.insertFirst(2);
        li.deleteIndex(2);
        li.display();
    }
}
