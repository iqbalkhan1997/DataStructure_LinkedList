package com.blz.linkedlist;

public class SinglyLinkedList {
    Node newNode;
    Node head;
    Node tail;

    SinglyLinkedList(){
        this.head=null;
        this.tail=null;
    }
    public void append(int data){
        newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        } else {
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void push(int data){
        newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        } else {
            Node temp=head;
            head=newNode;
            head.next=temp;
        }
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
    }

