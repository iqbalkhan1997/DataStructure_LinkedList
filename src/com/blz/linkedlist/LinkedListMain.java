package com.blz.linkedlist;

public class LinkedListMain {

    public static void main(String[] args) {
        System.out.println("Welcome to data structure's linkedList program");
        SinglyLinkedList list = new SinglyLinkedList();
        list.addElementAtEnd(56);
        list.addElementAtEnd(30);
        list.addElementAtEnd(70);
        list.display();
    }
}
