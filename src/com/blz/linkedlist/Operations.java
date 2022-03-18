package com.blz.linkedlist;

public class Operations {

    public void addElementInStart(){
    SinglyLinkedList list = new SinglyLinkedList();
        list.push(70);
        list.push(30);
        list.push(56);
        list.display();
    }
    public SinglyLinkedList addElementAtEnd(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(56);
        list.append(30);
        list.append(70);
        list.display();
        return list;
    }
    public void insertNodeInBetween() {
        SinglyLinkedList list = new SinglyLinkedList();
        Node first = list.append(56);
        Node second = list.append(70);
        Node newNode = new Node(30);
        System.out.println("Before");
        list.display();
        System.out.println();
        list.insertInBetween(first, newNode);
        System.out.println("After");
        list.display();
    }
}
