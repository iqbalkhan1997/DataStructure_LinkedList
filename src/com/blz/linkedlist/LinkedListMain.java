package com.blz.linkedlist;

import java.util.Scanner;

public class LinkedListMain {

    public static void main(String[] args) {
        Operations option = new Operations();
        System.out.println("Welcome to LinkedList program");
        System.out.println("1.To add elements at the start");
        System.out.println("2.To add elements at the end");
        System.out.println("3.To add element In between");
        System.out.println("4.To Delete element at start from linked list");
        System.out.println("5.To Delete element at end from linked list");
        System.out.println("6.To Find element from linked list");
        System.out.println("7.To Insert element to the existing linked list");
        System.out.println("8.To Delete element from the existing linked list");
        System.out.println("Enter number to perform the operation");
        Scanner scan = new Scanner(System.in);
        int operation=scan.nextInt();
        switch (operation){
            case 1:
                option.addElementInStart();
                break;
            case 2:
                option.addElementAtEnd();
                break;
            case 3:
                option.insertNodeInBetween();
                break;
            case 4:
                option.deleteNodeFromStart();
                break;
            case 5:
                option.deleteNodeFromEnd();
                break;
            case 6:
                option.searchNode();
                break;
            case 7:
                option.InsertNodeInMiddle();
                break;
            case 8:
                option.deleteElement();
                break;
            default:
                System.out.println("Please enter the valid option");
                break;
        }
    }
}
