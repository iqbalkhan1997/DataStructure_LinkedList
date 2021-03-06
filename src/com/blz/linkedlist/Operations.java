package com.blz.linkedlist;

import java.util.Scanner;

public class Operations {

    public SinglyLinkedList addElementInStart(){
    SinglyLinkedList list = new SinglyLinkedList();
        list.push(70);
        list.push(30);
        list.push(56);
        list.display();
        return list;
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

    public void deleteNodeFromStart() {
        SinglyLinkedList list = addElementInStart();
        System.out.println();
        list.pop();
        list.display();
    }

    public void deleteNodeFromEnd() {
        SinglyLinkedList list = addElementInStart();
        System.out.println();
        list.popLast();
        list.display();
    }
    public void searchNode(){
        System.out.println("Enter the element you want to search");
        Scanner scan = new Scanner(System.in);
        int elementToFind = scan.nextInt();
        SinglyLinkedList list = addElementInStart();
        list.find(elementToFind);
    }

        public void InsertNodeInMiddle() {
            SinglyLinkedList list = addElementInStart();
            System.out.println();
            list.InsertElementInMiddle(30,40);
        }

    public void deleteElement() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(56);
        list.append(30);
        list.append(40);
        list.append(70);
        list.display();
        System.out.println("After deleting the key");
        list.deleteNode(40);
        System.out.println(list.size());
        list.display();
    }

}
