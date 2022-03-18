package com.blz.linkedlist;

public class Operations {

    public void addElementInStart(){
    SinglyLinkedList list = new SinglyLinkedList();
        list.push(70);
        list.push(30);
        list.push(56);
        list.display();
    }
    public void addElementAtEnd(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(56);
        list.append(30);
        list.append(70);
        list.display();
    }

}
