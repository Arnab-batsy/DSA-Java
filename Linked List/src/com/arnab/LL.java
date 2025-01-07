package com.arnab;

public class LL {
    //Custom Linked List

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    //Inserting Elements (Method)
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = node;
        }
        ++size;
    }

    //Inserting at last
    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);

        tail.next = node;
        tail = node;

        ++size;
    }

    //Inserting at an index
    public void insert(int val, int index){
        if (index==0) {
            insertFirst(val);
            return;
        }
        if(index>=size){
            insertLast(val);
            return;
        }
        Node temp= head;
        for(int i= 1; i<index; i++){
            temp= temp.next;
        }

        Node node= new Node(val, temp.next);
        temp.next= node;
        size++;
    }

    //Deleting from first
    public void deleteFirst(){
        head= head.next;
        if(head==null) tail=null;
        size--;
    }

    //Getting the value of a node at a particular index
    public Node get(int index){
        Node temp= head;
        for(int i=0; i<index; i++){
            temp= temp.next;
        }
        return temp;
    }

    //Deleting the last element
    public void deleteLast(){ //Complexity O(N)
        if(size<=1){
            deleteFirst();
        }
        Node secondLast= get(size-2);
        tail=secondLast;
        tail.next=null;
    }

    //Delete from a particular index
    public void deleteIndex(int index){
        if(index==0){
            deleteFirst();
        }
        if(index==size-1){
            deleteLast();
        }
        Node atIndex= get(index-1);
        atIndex.next= atIndex.next.next;
    }

    //Displaying Elements
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        //Custom Node

        private int value;
        private Node next;
        //By default, the value of next is Null when no object is provided.

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
