package com.blz.linkedlist;

import java.util.Scanner;

public class SinglyLinkedList {
    Node newNode;
    Node head;
    Node tail;

    SinglyLinkedList(){
        this.head=null;
        this.tail=null;
    }
    public Node append(int data){
        newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        } else {
            tail.next=newNode;
            tail=newNode;
        }
        return newNode;
    }

    public Node push(int data){
        newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        } else {
            Node temp=head;
            head=newNode;
            head.next=temp;
        }
        return newNode;
    }

    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singlyList :");
            while(current != null){
                System.out.print(current.data+ " ");
                current=current.next;
            }
        System.out.println();
        }

    public void insertInBetween(Node node, Node newNode) {
        Node temp = node.next;
        node.next = newNode;
        newNode.next = temp;
    }

    public Node pop() {
        Node tempNode = this.head;
        this.head = this.head.next;
        return tempNode;
    }
    public void popLast() {
        Node tempNode = head;
        while (! tempNode.next.equals(this.tail)) {
            tempNode = tempNode.next; // 30
        }
        this.tail = tempNode;
        tempNode.next = null;
    }

    public void find(int element) {
        Node current = head;
        if (head == null) {
            System.out.println("List is Empty");
        }
        int found = 0;
        while (current != null) {
            if (current.data == element) {
                found = 1;
                break;
            } else {
                current = current.next;
            }
        }
        if (found == 1) {
            System.out.println("Entered number is present in list");
        } else {
            System.out.println("Entered number is not in the list");
        }
    }

    public void InsertElementInMiddle(int firstElement, int element) {
        Node exists = head;
        Node newNode = new Node(element);
        if (head == null) {
            System.out.println("List is Empty");
        }
        while (exists != null) {
            if (exists.data == firstElement) {
                insertInBetween(exists,newNode);
                break;
            } else {
                exists = exists.next;
            }
        }
        System.out.println();
        display();
    }

    public int size() {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public void deleteNode(int key) {
        Node current = head;
        Node tempNode = null;
        while (current != null && current.data != key) {
            tempNode = current;
            current = current.next;

        }
        if (current == null) {
            return;
        }
        tempNode.next = current.next;
    }

}

