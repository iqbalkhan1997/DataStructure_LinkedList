package com.blz.linkedlist;

import java.util.Scanner;

public class LinkedListMain {

    public static void main(String[] args) {
        Operations option = new Operations();
        System.out.println("Welcome to LinkedList program");
        System.out.println("1.To add elements at the start");
        System.out.println("2.To add elements at the end");
        System.out.println("3.To add element In between");
        System.out.println("4.To Delete element from linked list");
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
            default:
                System.out.println("Please enter the valid option");
                break;
        }
    }
}
