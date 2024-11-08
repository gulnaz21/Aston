package Homework_3;

import Homework_3.Collection.MyLinkedList;

import java.util.LinkedList;

public class LinkedListRun {
    public static void main(String[] args) {

        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("1");
        myLinkedList.add("2");
        myLinkedList.add("3");
        myLinkedList.add("4");
        myLinkedList.add("5");

        LinkedList<String> linkedList = new java.util.LinkedList<>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");

        System.out.println("MyLinkedList : " + myLinkedList);
        System.out.println("LinkedList   : " + linkedList);
        System.out.println();

        myLinkedList.addFirst("0");
        linkedList.addFirst("0");

        myLinkedList.addLast("6");
        linkedList.addLast("6");

        System.out.println("MyLinkedList : " + myLinkedList);
        System.out.println("LinkedList   : " + linkedList);
    }
}
